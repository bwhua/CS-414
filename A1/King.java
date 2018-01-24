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
		String position = toChar();
		char column = position.charAt(0);
		int row = getRow() + 1; //offset of 1
		try{
      // check if moveUp and moveDown are valid
      String move = "" + column + (row + 1);

      if(board.onBoard(move) && board.getPiece(move) == null || this.color != board.getPiece(move).color )
        legal.add(move);
      move = "" + column + (row - 1);

      if(board.onBoard(move) && board.getPiece(move) == null || this.color != board.getPiece(move).color)
        legal.add(move);


      // check the left side is valid
      char lColumn = (char) (column - 1);

      for (int i = row - 1 ; i<= row + 1; i++){
        move = "" + lColumn + i;
        if(board.onBoard(move) && board.getPiece(move) == null || this.color != board.getPiece(move).color)
          legal.add(move);
      }

      //test right side
      char rColumn = (char) (column + 1);

      for (int i = row - 1 ; i<= row + 1; i++){
        move = "" + rColumn+ i;
        if(board.onBoard(move) && board.getPiece(move) == null || this.color != board.getPiece(move).color)
          legal.add(move);
      }

    }catch (IllegalPositionException e){System.out.println("Illegal position for king (expected)");}

		return legal;
	}

}
