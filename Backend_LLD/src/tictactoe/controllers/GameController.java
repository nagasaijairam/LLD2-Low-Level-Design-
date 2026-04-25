package tictactoe.controllers;
import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;
import tictactoe.strategies.winning_strategies.WinningStrategy;
import tictactoe.models.Board;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game startGame(int dimensions,List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilder().setDimension(dimensions).setPlayer(players).setWinningStrategies(winningStrategies).build();
    }

    public void makeMove(Game game){

    }

    public GameState gameStatus(Game game){
        return game.getGameState();
    }

    public Player getWinningPlayer(Game game){
        return null;
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void undo(Game game){

    }

}
