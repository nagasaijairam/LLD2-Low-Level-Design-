package tictactoe.models;

import tictactoe.strategies.winning_strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Move> moves;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private Player NextMovePlayer;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Game(int dimension,List<WinningStrategy> winningStrategies, List<Player> players){
        this.board = new Board(dimension);
        this.winningStrategies = winningStrategies;
        this.players = players;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.NextMovePlayer = null;
        this.gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getNextMovePlayer() {
        return NextMovePlayer;
    }

    public void setNextMovePlayer(Player nextMovePlayer) {
        NextMovePlayer = nextMovePlayer;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void printBoard(){
        board.displayBoard();
    }

    public Move makeMove(Move move){
        return null;
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        //        Not required to ask user/client
//        private Board board;
//        private List<Move> moves;
//        private Player winner;
//        private GameState gameState;
//        private Player NextMovePlayer;

        private void BotCountValidation(){
            int botCount = 0;
            for(Player p : players){
                if(p instanceof Bot) {
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new IllegalArgumentException("Bot can't have more than 1 player");
            }
        }

        private void validateUniqueSymbils(){
            Set<Character> uniqueSymbols = new HashSet<>();
            for(Player p : players){
                uniqueSymbols.add(p.getSymbol().getaChar());
            }
            if (uniqueSymbols.size() != players.size() || uniqueSymbols.size() != dimension-1){
                throw new RuntimeException("All players must have unique symbols");
            }
        }

        private void validations(){
            if(dimension < 2){
                throw new IllegalArgumentException("Invalid dimension");
            }
            validateUniqueSymbils();
            BotCountValidation();
        }

        public Game build(){
            validations();
            return new Game(dimension,winningStrategies,players);
        }

        public static Builder getInstance(){
            return new Builder();
        }

        public static Builder getBuilder(){
            return new Builder();
        }

        public Builder setDimension(int dimension) {
              this.dimension = dimension;
              return this;
        }

        public Builder setPlayer(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public int getDimension() {
            return this.dimension;
        }

        public List<Player> getPlayers() {
            return this.players;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return this.winningStrategies;

        }
    }
}
