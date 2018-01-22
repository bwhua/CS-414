
/**
 * @author Brandon Hua
 *
 */
public class ChessBoard {

	private ChessPiece[][] board;
	
	public ChessBoard(){
		this.board = new ChessPiece[8][8];
	}
	public void initialize(){
		ChessBoard a = new ChessBoard();
		Rook br1 = new Rook(a, ChessPiece.Color.BLACK);
		Knight bk1 = new Knight(a, ChessPiece.Color.BLACK);
		Bishop bb1 = new Bishop(a, ChessPiece.Color.BLACK);
		King bki = new King(a, ChessPiece.Color.BLACK);
		Queen bq = new Queen(a, ChessPiece.Color.BLACK);
		Rook br2 = new Rook(a, ChessPiece.Color.BLACK);
		Knight bk2 = new Knight(a, ChessPiece.Color.BLACK);
		Bishop bb2 = new Bishop(a, ChessPiece.Color.BLACK);
		Pawn bp1 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp2 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp3 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp4 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp5 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp6 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp7 = new Pawn(a, ChessPiece.Color.BLACK);
		Pawn bp8 = new Pawn(a, ChessPiece.Color.BLACK);


		placePiece(br1, "a8");
		placePiece(bk1, "b8");
		placePiece(bb1,"c8");
		placePiece(bq, "d8");
		placePiece(bki, "e8");
		placePiece(bb2, "f8");
		placePiece(bk2, "g8");
		placePiece(br2, "h8");
		placePiece(bp1, "a7");
		placePiece(bp2, "b7");
		placePiece(bp3, "c7");
		placePiece(bp4, "d7");
		placePiece(bp5, "e7");
		placePiece(bp6, "f7");
		placePiece(bp7, "g7");
		placePiece(bp8, "h7");
		
		Rook wr1 = new Rook(a, ChessPiece.Color.WHITE);
		Knight wk1 = new Knight(a, ChessPiece.Color.WHITE);
		Bishop wb1 = new Bishop(a, ChessPiece.Color.WHITE);
		Rook wr2 = new Rook(a, ChessPiece.Color.WHITE);
		Knight wk2 = new Knight(a, ChessPiece.Color.WHITE);
		Bishop wb2 = new Bishop(a, ChessPiece.Color.WHITE);
		King wki = new King(a, ChessPiece.Color.WHITE);
		Queen wq = new Queen(a, ChessPiece.Color.WHITE);
		Pawn wp1 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp2 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp3 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp4 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp5 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp6 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp7 = new Pawn(a, ChessPiece.Color.WHITE);
		Pawn wp8= new Pawn(a, ChessPiece.Color.WHITE);

		placePiece(wr1, "a1");
		placePiece(wk1, "b1");
		placePiece(wb1,"c1");
		placePiece(wq, "d1");
		placePiece(wki, "e1");
		placePiece(wb2, "f1");
		placePiece(wk2, "g1");
		placePiece(wr2, "h1");
		placePiece(wp1, "a2");
		placePiece(wp2, "b2");
		placePiece(wp3, "c2");
		placePiece(wp4, "d2");
		placePiece(wp5, "e2");
		placePiece(wp6, "f2");
		placePiece(wp7, "g2");
		placePiece(wp8, "h2");	
	}
	 ChessPiece getPiece(String position){
		int row = (Integer.parseInt(position.substring(1))) -1;
//		if(row < 0)
//			row=0;
//		if(row> 7)
//			row=7;
		int column =0;
		switch(position.charAt(0)){
		case 'a': column =0;
			break;
		case 'b': column =1;
		break;
		case 'c': column =2;
		break;
		case 'd': column =3;
		break;
		case 'e': column =4;
		break;
		case 'f': column =5;
		break;
		case 'g': column =6;
		break;
		case 'h': column =7;
		break;
		default:
			break;
		}
		
		return this.board[row][column];
	}
	public boolean placePiece(ChessPiece piece, String position){
		
		if(getPiece(position) == null ||piece.color != getPiece(position).color){
			piece.setPosition(position);
			board[piece.row][piece.column] = piece;
			return true;
		}
		return false;

	}
	public boolean move(String fromPosition, String toPosition){
//		System.out.println("from" +fromPosition);
//		System.out.println(toPosition);
		if(getPiece(fromPosition)== null)																				//if piece is not at from Position
			return false;
		if(getPiece(toPosition)== null){																				// if no piece at toPosition
			if(getPiece(fromPosition).legalMoves().contains(toPosition)){
				int row = getPiece(fromPosition).row;
				int col = getPiece(fromPosition).column;
				placePiece(board[row][col], toPosition);
				board[row][col] = null;
				//System.out.println("Checking: row "+ row +" column "+ col);
				return true;
			}
		}
			
		if(getPiece(fromPosition).legalMoves().contains(toPosition)){															
			if(getPiece(fromPosition).color != getPiece(toPosition).color){													//if they are different colors
				int row = getPiece(fromPosition).row;
				int col = getPiece(fromPosition).column;
				placePiece(board[row][col], toPosition);
				board[row][col] = null;
				//System.out.println("Checking: row "+ row +" column "+ col);
				return true;				
				}
			
		}
		return false;
	}
	public String toString(){
	    String chess="";
	    String upperLeft = "\u250C";
	    String upperRight = "\u2510";
	    String horizontalLine = "\u2500";
	    String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
	    String verticalLine = "\u2502";
	    String upperT = "\u252C";
	    String bottomLeft = "\u2514";
	    String bottomRight = "\u2518";
	    String bottomT = "\u2534";
	    String plus = "\u253C";
	    String leftT = "\u251C";
	    String rightT = "\u2524";

	    String topLine = upperLeft;
	    for (int i = 0; i<7; i++){
	        topLine += horizontal3 + upperT;
	    }
	    topLine += horizontal3 + upperRight;

	    String bottomLine = bottomLeft;
	    for (int i = 0; i<7; i++){
	        bottomLine += horizontal3 + bottomT;
	    }
	    bottomLine += horizontal3 + bottomRight;
	    chess+=topLine + "\n";

	    for (int row = 7; row >=0; row--){
	        String midLine = "";
	        for (int col = 0; col < 8; col++){
	            if(board[row][col]==null) {
	                midLine += verticalLine + " \u3000 ";
	            } else {midLine += verticalLine + " "+board[row][col]+" ";}
	        }
	        midLine += verticalLine;
	        String midLine2 = leftT;
	        for (int i = 0; i<7; i++){
	            midLine2 += horizontal3 + plus;
	        }
	        midLine2 += horizontal3 + rightT;
	        chess+=midLine+ "\n";
	        if(row>=1)
	            chess+=midLine2+ "\n";
	    }

	    chess+=bottomLine;
	    return chess;
	}
	
	public static void main(String[] args) {
	    ChessBoard board = new ChessBoard();
	    board.initialize();
	    System.out.println(board);
	    board.move("a8", "a1");	    
	    System.out.println(board);
	    board.move("c7", "c6");
	    System.out.println(board);

	}
}