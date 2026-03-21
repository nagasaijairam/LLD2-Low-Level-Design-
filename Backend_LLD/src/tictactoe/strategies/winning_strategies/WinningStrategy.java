package tictactoe.strategies.winning_strategies;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Player;

public interface WinningStrategy {
    boolean winningStrategy(Board board,  Player player, Cell cell);
}
