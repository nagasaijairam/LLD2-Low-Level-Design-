package tictactoe.strategies.winning_strategies;
import tictactoe.models.Move;
import tictactoe.models.Board;

public class DiagonalWinningStrategy implements WinningStrategy{
    public boolean checkWinner(Board board,Move move){
        System.out.println("In DiagonalWinningStrategy");
        return false;
    }
}
