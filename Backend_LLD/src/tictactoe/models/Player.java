package tictactoe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private Cell cell;
    private PlayerType player;
    private Symbol symbol;
    private static Scanner scanner =  new Scanner(System.in);

    public Player(Symbol symbol,String name, PlayerType player) {
        this.name = name;
        this.symbol = symbol;
        this.cell = cell;
        this.player = player;
//        this.scanner  = new Scanner(System.in);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public PlayerType getPlayer() {
        return player;
    }

    public void setPlayer(PlayerType player) {
        this.player = player;
    }

    public void setPlayerType(PlayerType playerType) {
        this.player = playerType;
    }

    public PlayerType getPlayerType() {
        return player;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

     Move makeMove(Board board){
        // take the row,col as an input from the user
        System.out.println("Pleas enter the row number where you want to make the move");
//         Scanner sc = new Scanner(System.in);// optimization
        int row = scanner.nextInt();

        System.out.println("Pleas enter the column number where you want to make the move");
        int column = scanner.nextInt();

        return new Move(this, new Cell(row,column));
    }
}
