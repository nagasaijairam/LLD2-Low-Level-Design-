package tictactoe.strategies.winning_strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    private Map<Integer,Map<Character,Integer>> rowMaps = new HashMap<>();

    public boolean checkWinner(Board board, Move move){
        System.out.println("In RowWinningStrategy");
        int row = move.getCell().getRow();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        if(!rowMaps.containsKey(row)){
            rowMaps.put(row, new HashMap<Character,Integer>());
        }

        Map<Character,Integer> currentRowMap = rowMaps.get(row);

        if(!currentRowMap.containsKey(aChar)){
            currentRowMap.put(aChar, 0);
        }
        currentRowMap.put(aChar, currentRowMap.get(aChar) + 1);

        return currentRowMap.get(aChar).equals(board.getDimension());
    }
}
