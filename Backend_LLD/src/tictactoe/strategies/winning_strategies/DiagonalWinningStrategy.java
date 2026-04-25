package tictactoe.strategies.winning_strategies;
import tictactoe.models.Move;
import tictactoe.models.Board;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    private final Map<Character,Integer> leftDiagonalMap = new HashMap<Character,Integer>();
    private final Map<Character,Integer> rightDiagonalMap = new HashMap<Character,Integer>();

    public boolean checkWinner(Board board,Move move){
        System.out.println("In DiagonalWinningStrategy");
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        // left diagnols row == col
        if (row == col){
            leftDiagonalMap.put(aChar, leftDiagonalMap.getOrDefault(aChar, 0) + 1);
        }

        //right diagnols row+col = N-1;
        if ((row+col) == board.getDimension()-1){
            if(!rightDiagonalMap.containsKey(aChar)){
                rightDiagonalMap.put(aChar,0);
            }
            rightDiagonalMap.put(aChar, rightDiagonalMap.get(aChar) + 1);
        }

        if((row == col)&& leftDiagonalMap.get(aChar)==(board.getDimension()) ){
            return true;
        }
        if((row+col) == board.getDimension()-1 &&  rightDiagonalMap.get(aChar)==(board.getDimension()) ){
            return true;
        }

        return false;

    }
}
