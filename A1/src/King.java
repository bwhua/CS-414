import java.util.ArrayList;


public class King extends ChessPiece{

	public King(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2654";
		else
			return "\u265A";	}

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> legal= new ArrayList<String>(); 
		return legal;
	}

}
