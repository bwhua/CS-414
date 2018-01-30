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
      //test rook
      assertEquals("\u265C", testBoard.getPiece("a8").toString());
      assertEquals("\u265C", testBoard.getPiece("h8").toString());
      assertEquals("\u2656", testBoard.getPiece("a1").toString());
      assertEquals("\u2656", testBoard.getPiece("h1").toString());
      //test knight
      assertEquals("\u265E", testBoard.getPiece("b8").toString());
      assertEquals("\u265E", testBoard.getPiece("g8").toString());
      assertEquals("\u2658", testBoard.getPiece("b1").toString());
      assertEquals("\u2658", testBoard.getPiece("g1").toString());
      //test bishop
      assertEquals("\u265D", testBoard.getPiece("c8").toString());
      assertEquals("\u265D", testBoard.getPiece("f8").toString());
      assertEquals("\u2657", testBoard.getPiece("c1").toString());
      assertEquals("\u2657", testBoard.getPiece("f1").toString());
      //test king
      assertEquals("\u265A", testBoard.getPiece("d8").toString());
      assertEquals("\u2654", testBoard.getPiece("d1").toString());
      //test queen
      assertEquals("\u265B", testBoard.getPiece("e8").toString());
      assertEquals("\u2655", testBoard.getPiece("e1").toString());

      //test pawn and null spots
      for(char i = 'a'; i < 'i'; i++){
        assertEquals("\u265F", testBoard.getPiece(i + "7").toString());
        assertEquals("\u2659", testBoard.getPiece(i + "2").toString());

        assertEquals(null, testBoard.getPiece(i + "3"));
        assertEquals(null, testBoard.getPiece(i + "4"));
        assertEquals(null, testBoard.getPiece(i + "5"));
        assertEquals(null, testBoard.getPiece(i + "6"));

      }






    } catch (IllegalPositionException e) {
      e.printStackTrace();
    }

  }

}
