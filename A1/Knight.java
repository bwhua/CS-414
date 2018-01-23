import java.util.ArrayList;


public class Knight extends ChessPiece {

	public Knight(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2658";
		else
			return "\u265E";
	}

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> legal= new ArrayList<String>(); 
		return legal;
	}

}
