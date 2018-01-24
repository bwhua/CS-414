import java.util.ArrayList;

/**
 * @author Brandon Hua
 *
 */
public class Rook extends ChessPiece {

	public Rook(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		Color color = this.color;
		if (color == Color.WHITE)
			return "\u2656";
		else
			return "\u265C";
	}




	public ArrayList<String> legalMoves() {
		System.out.println(board);
		ArrayList<String> legal = new ArrayList<String>();

		String position = toChar();

		try{
			int row = getRow() + 1;
			char col	 = position.charAt(0);

			//moving up
			int rowUp = row+1;
			String move = "" + col + rowUp;
			while(board.onBoard(move)){					//moving up

				if(board.getPiece(move) == null)							//if 1 up  null
				{
					legal.add(move);
				}
				else{
					if(color == board.getPiece(move).color)			//if they are same color
					{
						break;
					}
					if(color != board.getPiece(move).color){			//if they are different colors
						legal.add(move);
						break;
					}
				}
				rowUp +=1;
				move = "" + col + rowUp;
			}
			int rowDown = row -1;
			move = "" + col + rowDown;
			while(board.onBoard(move)){					//moving down
				if(board.getPiece(move) == null)							//if 1 up  null
					legal.add(move);
				else{
					if(color == board.getPiece(move).color)			//if they are same color
						break;
					if(color != board.getPiece(move).color){			//if they are different colors
						legal.add(move);
						break;
					}
				}
				rowDown -=1;
				move = "" + col + rowDown;
			}


			row = this.row+1;
			col	 = position.charAt(0);
			while(true){					//moving left
				col -=1;
				if(col == 'a'-1)
					break;
				String a ="" + col+ row;
				if(board.getPiece(a) == null )							//if 1 left is null
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
			col	 = position.charAt(0);
			while(true){					//moving right
				col +=1;
				if(col == 'i')
					break;
				String a ="" + col+ row;
				if(board.getPiece(a) == null )							//if 1 right is null
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
		}catch(IllegalPositionException e){System.out.println("Invalid position of rook");}
		return legal;
	}

}
