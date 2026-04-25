package tictactoe.strategies.winning_strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {
    private final Map<Integer,Map<Character,Integer>> colMap = new HashMap<>();

    public boolean checkWinner(Board board, Move move) {
//        System.out.println("In ColWinningStrategy");
        int col = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        //if it is the first move of the game, we have to create the new hash map for the col first.
        if(!colMap.containsKey(col)){
            colMap.put(col, new HashMap<>());
        }


        Map<Character,Integer> currentColMap = colMap.get(col);
        currentColMap.put(aChar,currentColMap.getOrDefault(aChar,0)+1);
        return currentColMap.get(aChar)==board.getDimension();
    }
}
