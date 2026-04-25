package tictactoe.models;

import tictactoe.factories.BotPlayingStrategyFactory;
import tictactoe.strategies.bot_playing_strategies.BotPlayingStrategey;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategey botPlayingStrategey;

    public Bot(Symbol symbol,String name,PlayerType player, BotDifficultyLevel botDifficultyLevel) {
        super(symbol,name, player);
        this.botDifficultyLevel = botDifficultyLevel;
//        this.botPlayingStrategey = botPlayingStrategey;
        this.botPlayingStrategey = BotPlayingStrategyFactory.getBotPlayingStrategey(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategey getBotPlayingStrategey() {
        return botPlayingStrategey;
    }

    public void setBotPlayingStrategey(BotPlayingStrategey botPlayingStrategey) {
        this.botPlayingStrategey = botPlayingStrategey;
    }

    @Override
     public Move makeMove(Board board) {
        return super.makeMove(board);
    }
}
