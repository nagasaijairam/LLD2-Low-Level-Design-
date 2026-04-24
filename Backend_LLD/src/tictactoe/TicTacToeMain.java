package tictactoe;

import tictactoe.models.*;
import tictactoe.strategies.winning_strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TicTacToeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe!");
        Scanner input = new Scanner(System.in);

        int dimension = input.nextInt();
        List<Player> players = new ArrayList<>();
        List<WinningStrategy>  winningStrategies = new ArrayList<>();
        Game game = Game.getBuilder().setDimension(dimension).setPlayer(players).setWinningStrategies(winningStrategies).build();
        players.add(new Player(new Symbol('X'), "Jairam", PlayerType.BOT));
        players.add(new Bot(new Symbol('0'), "Siri", PlayerType.BOT, BotDifficultyLevel.MEDIUM));

    }
}
