package tictactoe.strategies.bot_playing_strategies;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.CellState;
import tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategey{
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell: row){
                if(cell.getCellState() == CellState.EMPTY){
                    return new Move(null, cell);
                }
            }
        }
        return null;
    }
}
