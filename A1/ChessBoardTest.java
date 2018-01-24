import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ChessBoardTest extends Exception{
  @Test
  public void testChessBoard(){
    ChessBoard testBoard = new ChessBoard();
    try {
      assertEquals(null, testBoard.getPiece("a1"));
      assertEquals(null, testBoard.getPiece("a8"));
      assertEquals(null, testBoard.getPiece("h1"));
      assertEquals(null, testBoard.getPiece("h8"));


      testBoard.initialize();
      assertEquals(ChessPiece.Color.WHITE, testBoard.getPiece("a1").color);
      assertEquals(ChessPiece.Color.BLACK, testBoard.getPiece("h8").color);
    } catch (IllegalPositionException e) {
      e.printStackTrace();
    }

  }

}
