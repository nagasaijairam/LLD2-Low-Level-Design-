package tictactoe.models;

import tictactoe.InvalidMoveExceptions;
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

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    private int nextMovePlayerIndex;
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
        this.nextMovePlayerIndex = 0;
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

    private boolean validagteMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if((row<0 && row >= board.getDimension()) && (col<0 && col >= board.getDimension())){
            return false;
        }

        if(!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            return false;
        }

        return true;
    }

    private boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }

public Move makeMove() throws InvalidMoveExceptions {
    Player currentPlayer = players.get(nextMovePlayerIndex);
    System.out.println("This is "+ currentPlayer.getName()+"'s move/turn");

    //player will choose the move that he/she want to make.
    Move move = currentPlayer.makeMove(board);

    //Game will validate if the move that player has chosen is valid or not/
    if(!validagteMove(move)){
        System.out.println("This is illegal move");
        throw new InvalidMoveExceptions("This is illegal move, please try again");
    }
    //move is valid so apply to the board
    int row = move.getCell().getRow();
    int col = move.getCell().getCol();
    Cell cell = board.getBoard().get(row).get(col);
    cell.setCellState(CellState.FILLED);
    cell.setPlayer(currentPlayer);
    Move finalMove = new Move(currentPlayer,cell);
    moves.add(finalMove);
    nextMovePlayerIndex = (nextMovePlayerIndex + 1)% players.size();
    if(checkWinner(finalMove)){
        winner = currentPlayer;
        gameState = GameState.ENDED;
    }else if(moves.size()==(board.getDimension()*board.getDimension())){
        winner = null;
        gameState = GameState.DRAW;
    }

    return move;
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
