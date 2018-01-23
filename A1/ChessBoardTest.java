import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ChessBoardTest extends Exception{
  @Test
  public void testChessBoard(){
    ChessBoard testBoard = new ChessBoard();
    assertEquals(null, testBoard.getPiece("a1"));
    assertEquals(null, testBoard.getPiece("a8"));
    assertEquals(null, testBoard.getPiece("h1"));
    assertEquals(null, testBoard.getPiece("h8"));
  }

}
