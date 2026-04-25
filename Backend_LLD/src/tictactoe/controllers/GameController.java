package tictactoe.controllers;
import tictactoe.InvalidMoveExceptions;
import tictactoe.models.*;
import tictactoe.strategies.winning_strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game startGame(int dimensions,List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilder().setDimension(dimensions).setPlayer(players).setWinningStrategies(winningStrategies).build();
    }

    public Move makeMove(Game game) throws InvalidMoveExceptions {
        return game.makeMove();
    }

    public GameState gameStatus(Game game){
        return game.getGameState();
    }

    public Player getWinningPlayer(Game game){
        return game.getWinner();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void undo(Game game){

    }

}
