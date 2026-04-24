package tictactoe.models;

public class Player {
    private String name;
    private Cell cell;
    private PlayerType player;
    private Symbol symbol;

    public Player(Symbol symbol,String name, PlayerType player) {
        this.name = name;
        this.symbol = symbol;
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

}
