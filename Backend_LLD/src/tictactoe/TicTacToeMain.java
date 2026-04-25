package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.models.*;
import tictactoe.strategies.winning_strategies.ColWinningStrategy;
import tictactoe.strategies.winning_strategies.DiagonalWinningStrategy;
import tictactoe.strategies.winning_strategies.RowWinningStrategy;
import tictactoe.strategies.winning_strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TicTacToeMain {
    public static void main(String[] args) throws InvalidMoveExceptions {
        System.out.println("Welcome to TicTacToe!");
        System.out.println("Please enter the board size");
        Scanner input = new Scanner(System.in);

        int dimension = input.nextInt();
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategies = Arrays.asList(new RowWinningStrategy(), new ColWinningStrategy(), new DiagonalWinningStrategy());
        players.add(new Player(new Symbol('X'), "Jairam", PlayerType.BOT));
        players.add(new Bot(new Symbol('0'), "Siri", PlayerType.BOT, BotDifficultyLevel.EASY));
//        Game game = Game.getBuilder().setDimension(dimension).setPlayer(players).setWinningStrategies(winningStrategies).build();
        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, winningStrategies);
        game.printBoard();
        while(gameController.gameStatus(game).equals(GameState.IN_PROGRESS)){
//            1. it should print the boared
//            2. Make a move
            gameController.printBoard(game);
            System.out.println("Do you want to undo? --> Y/N");
            String choice = input.next();
            if(choice.equalsIgnoreCase("y")){
                System.out.println("Undo successful");
                gameController.undo(game);
                continue;
            }
            gameController.makeMove(game);
        }
        gameController.printBoard(game);
        if(gameController.gameStatus(game).equals(GameState.ENDED)){
            System.out.println(gameController.getWinningPlayer(game).getName()+" Has won the game!");
        }else{
            System.out.println("Game is DRAW!");
        }
    }
}
