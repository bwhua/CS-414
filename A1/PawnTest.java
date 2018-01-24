import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class PawnTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Pawn testPawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testPawn, "d2");
    testBoard.placePiece(whitePawn, "c3");
    testBoard.placePiece(blackPawn, "e3");
    //todo: make sure legal moves include d5, d6, e5
    ArrayList<String> legal = testPawn.legalMoves();
    assertEquals(3,legal.size());
    assert(legal.contains("d5"));
    assert(legal.contains("d6"));
    assert(legal.contains("e5"));
  }
}
