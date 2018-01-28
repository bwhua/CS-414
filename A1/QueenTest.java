import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueenTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Queen testQueen = new Queen(testBoard, ChessPiece.Color.WHITE);
    testBoard.placePiece(testQueen, "d4");

    assertTrue(testQueen.legalMoves().isEmpty());

  }
}
