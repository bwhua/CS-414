import java.util.ArrayList;


public class Pawn extends ChessPiece{
	boolean firstMove;

	public Pawn(ChessBoard board, Color color) {
		super(board, color);
		firstMove = true;
	}

	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2659";
		else
			return "\u265F";
	}

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> legal = new ArrayList<String>(); 
		
		String position = toChar();

		if(color == Color.WHITE){
			
			
			if(firstMove){															//beginning moves
				
				String twoSpace = position + getRow() + 2;
				if (board.getPiece(twoSpace) == null){
					legal.add(twoSpace);
				}
			}
			int normal = row+2;
			String a = position + normal;										// normal moves
			if(board.getPiece(a) == null)
				legal.add(a);
			
			char col	 = (char) (position.charAt(0) +1);
			int right = row+2;
			String c =  "" + col + right ;	
			if(board.getPiece(c) != null) {
				if(!(position.equals("h")) && board.getPiece(c).color.equals(Color.BLACK) )
				legal.add(c);
			}
			
			 col	 = (char) (position.charAt(0) -1);
			int left = row+2;
			 c =  "" + col + left ;											 //attack move left
			 if(board.getPiece(c) != null) {
			 if(position != "a" && board.getPiece(c).color.equals(Color.BLACK))
				legal.add(c);
		}

		}
			if(color == Color.BLACK){
			
			
			if(row == 6 ){															//beginning moves
				
				String b = position + "6";
				if (board.getPiece(b) == null){
					String c = position + "5";
					if (board.getPiece(c) == null)
						legal.add(c);
				}
			}
			int normal = row ;
			String a = position + normal;										// normal moves
			if(board.getPiece(a) == null)
				legal.add(a);
			
			char col	 = (char) (position.charAt(0) +1);
			int right = row;
			String c =  "" + col + right ;													//attack move right
			if(board.getPiece(c) != null) 
			if(position != "h" &&board.getPiece(c).color.equals(Color.BLACK) )
				legal.add(c);
			
			 col	 = (char) (position.charAt(0) -1);
			int left = row;
			 c =  "" + col + left ;														//attack move left
			 if(board.getPiece(c) != null) 
			 if(position != "a" && board.getPiece(c).color.equals(Color.BLACK))
				legal.add(c);
		}
		return legal;
	}

	

}
