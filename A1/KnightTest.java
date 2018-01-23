import org.junit.Test;


public class KnightTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Knight testKnight = new Knight(testBoard, ChessPiece.Color.WHITE);
    testBoard.placePiece(testKnight, "d4");
    assert(testKnight.legalMoves().isEmpty());

  }
}
