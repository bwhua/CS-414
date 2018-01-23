import java.util.ArrayList;


public class Queen extends ChessPiece{

	public Queen(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2655";
		else
			return "\u265B";
	}
	

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> legal= new ArrayList<String>(); 
		return legal;
	}

}
