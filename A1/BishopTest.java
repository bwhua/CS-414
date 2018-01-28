
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class BishopTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Bishop testBishop = new Bishop(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testBishop, "d4");
    testBoard.placePiece(whitePawn, "b6");
    testBoard.placePiece(blackPawn, "f6");


    ArrayList<String> legal = testBishop.legalMoves();
    assertEquals(9, legal.size());
    assertTrue(legal.contains("a1"));
    assertTrue(legal.contains("b2"));
    assertTrue(legal.contains("c3"));
    assertTrue(legal.contains("c5"));
    assertTrue(legal.contains("e3"));
    assertTrue(legal.contains("f2"));
    assertTrue(legal.contains("g1"));
    assertTrue(legal.contains("e5"));
    assertTrue(legal.contains("f6"));

  }
}
