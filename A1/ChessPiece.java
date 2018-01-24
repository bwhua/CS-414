import java.util.ArrayList;

/**
 * @author Brandon Hua
 *
 */
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
	public int getRow(){
		return this.row;
	}
	public int getColumn(){
		return this.column;
	}
	public void setRow(int i){
		this.row = i;
	}
	public void setColumn(int i){
		this.column = i;
	}
	public Color getColor(){
		return color;
	}

	public String toChar(){
		String col = "";
		switch(this.column){
			case 0: col = "a";
				break;
			case 1: col = "b";
				break;
			case 2: col = "c";
				break;
			case 3: col = "d";
				break;
			case 4: col = "e";
				break;
			case 5: col = "f";
				break;
			case 6: col = "g";
				break;
			case 7: col = "h";
				break;
			default:
				break;
		}
		return col;
  }

	public String getPosition(){
		String position = this.toChar();
		position += this.getRow() + 1;
		return position;
	}
	
	public void setPosition(String position){
		switch(position.charAt(0)){
		case 'a': this.column =0;
			break;
		case 'b': this.column =1;
		break;
		case 'c': this.column =2;
		break;
		case 'd': this.column =3;
		break;
		case 'e': this.column =4;
		break;
		case 'f': this.column =5;
		break;
		case 'g': this.column =6;
		break;
		case 'h': this.column =7;
		break;
		default:
			break;
		}
		this.row = position.charAt(1)-49;
	}
	
	abstract public String toString();
	
	abstract public ArrayList<String> legalMoves();
}
