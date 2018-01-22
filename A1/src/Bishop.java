import java.util.ArrayList;


public class Bishop extends ChessPiece{

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2657";
		else
			return "\u265D";
	}

	@Override
	public ArrayList<String> legalMoves() {
		ArrayList<String> legal = new ArrayList<String>();

		String position = "";
		switch(this.column){
		case 0: position = "a";
		break;
		case 1: position = "b";
		break;
		case 2: position = "c";
		break;
		case 3: position = "d";
		break;
		case 4: position = "e";
		break;
		case 5: position = "f";
		break;
		case 6: position = "g";
		break;
		case 7: position = "h";
		break;
		default:
			break;
		}
		int row = this.row+1;
		char col	 = (char) (position.charAt(0)); 
		while(true){
			row += 1;												//move up right
			col = (char) (col+1);
			if(row >8 || col == 'i')
				break;

			String a ="" + col+ row;
			if(board.getPiece(a) == null )							//if 1 up 1 right is null
				legal.add(a);
			if(board.getPiece(a) != null )	{					// if not null
				if(color == board.getPiece(a).color)			//if they are same color
					break;
				if(color != board.getPiece(a).color){			//if they are different colors
					legal.add(a);
					break;
				}
			}
		}	
		
		
		row = this.row+1;
		 col	 = (char) (position.charAt(0)); 	
		while(true){
			row +=1;												//move up left
			col = (char) (col-1); 		
			if(row >8 || col == 'a'-1)
				break;
			String a ="" + col+ row;
			if(board.getPiece(a) == null )							//if 1 up 1 left is null
				legal.add(a);
			if(board.getPiece(a) != null )	{						// if not null
				if(color == board.getPiece(a).color)			//if they are same color
					break;
				if(color != board.getPiece(a).color)	{			//if they are different colors
					legal.add(a);
					break;
				}	}}
		
		
		row = this.row+1;
		col	 = (char) (position.charAt(0)); 	
		while(true){
			row -=1;												//move down right
			col = (char) (col +1); 		
			if(row <1 || col == 'i')
				break;
			String a ="" + col+ row;
			if(board.getPiece(a) == null )							//if 1 down 1 right is null
				legal.add(a);
			if(board.getPiece(a) != null ){						// if not null
				if(color == board.getPiece(a).color)			//if they are same color
					break;
				if(color != board.getPiece(a).color){				//if they are different colors
					legal.add(a);
					break;
				}	}}
		
		
		row = this.row+1;
		col	 = (char) (position.charAt(0));
		while(true){
			row -= 1;												//move down left
			col = (char) (col-1); 		
			if(row <1 || col == 'a'-1)
				break;
			String a ="" + col+ row;
			if(board.getPiece(a) == null )							//if 1 up 1 left is null
				legal.add(a);
			if(board.getPiece(a) != null ){							// if not null
				if(color == board.getPiece(a).color)			//if they are same color
					break;
				if(color != board.getPiece(a).color){				//if they are different colors
					legal.add(a);
					break;
				}	}}
		return legal;
	}
}
