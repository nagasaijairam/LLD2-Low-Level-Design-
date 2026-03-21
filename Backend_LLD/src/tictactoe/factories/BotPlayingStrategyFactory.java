package tictactoe.factories;

import tictactoe.models.BotDifficultyLevel;
import tictactoe.strategies.bot_playing_strategies.BotPlayingStrategey;
import tictactoe.strategies.bot_playing_strategies.EasyBotPlayingStrategy;
import tictactoe.strategies.bot_playing_strategies.HardBotPlayingStrategy;
import tictactoe.strategies.bot_playing_strategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategey getBotPlayingStrategey(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel == BotDifficultyLevel.EASY) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.HARD) {
            return new HardBotPlayingStrategy();
        } else{
            return new MediumBotPlayingStrategy();
        }
    }
}