package tictactoe.models;

import tictactoe.factories.BotPlayingStrategyFactory;
import tictactoe.strategies.bot_playing_strategies.BotPlayingStrategey;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategey botPlayingStrategey;

    public Bot(String name, Cell cell, PlayerType player, BotDifficultyLevel botDifficultyLevel) {
        super(name, cell, player);
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


}
