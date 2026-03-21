package tictactoe.strategies.bot_playing_strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface BotPlayingStrategey {
    Move makeMove(Board board);
}
