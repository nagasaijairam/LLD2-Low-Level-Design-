package tictactoe.models;

public class Player {
    private String name;
    private Cell cell;
    private PlayerType player;

    public Player(String name, Cell cell, PlayerType player) {
        this.name = name;
        this.cell = cell;
        this.player = player;
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
}
