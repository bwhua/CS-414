import java.util.ArrayList;

public abstract class ChessPiece {
    public enum Color {WHITE, BLACK}
    protected ChessBoard board; // the board it belongs to, default null
    protected int row; // the index of the horizontal rows 0..7
    protected int column; // the index of the vertical column 0..7
    protected Color color; // the color of the piece

    public ChessPiece(ChessBoard board, Color color){
      this.board = board;
      this.color = color;
    }

    //todo: This method returns the color of the piece.
    public Color getColor(){
        return color;
    }

    //todo: gets the string representation of the position
    public String getPosition(){
        return null;
    }

    //todo: sets the position if valid, otherwise throws exception
    public void setPosition(String position) throws IllegalPositionException{}


    abstract public String toString();

    //todo: shows all
    abstract public ArrayList<String> legalMoves();
}
