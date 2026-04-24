package tictactoe.strategies.winning_strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class ColWinningStrategy implements WinningStrategy {
    public boolean checkWinner(Board board, Move move) {
        System.out.println("In ColWinningStrategy");
        return true;
    }
}
