import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class KnightTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Knight testKnight = new Knight(testBoard, ChessPiece.Color.WHITE);
    testBoard.placePiece(testKnight, "d4");
    assertTrue(testKnight.legalMoves().isEmpty());

  }
}
