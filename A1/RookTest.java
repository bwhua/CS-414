import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class RookTest {
  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Rook testWRook = new Rook(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);
    Rook testBRook = new Rook(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testWRook, "d4");
    testBoard.placePiece(testBRook, "f6");
    testBoard.placePiece(whitePawn, "d6");
    testBoard.placePiece(blackPawn, "f4");
    //todo: make sure legalW moves include d5, e4, f4, a4, b4, c4, d1, d2, d3
    ArrayList<String> legalW = testWRook.legalMoves();

    assertEquals(9, legalW.size());
    assertTrue(legalW.contains("d5"));
    assertTrue(legalW.contains("e4"));
    assertTrue(legalW.contains("f4"));
    assertTrue(legalW.contains("a4"));
    assertTrue(legalW.contains("b4"));
    assertTrue(legalW.contains("c4"));
    assertTrue(legalW.contains("d1"));
    assertTrue(legalW.contains("d2"));
    assertTrue(legalW.contains("d3"));

    ArrayList<String> legalB = testBRook.legalMoves();

    assertEquals(7, legalB.size());
    assertTrue(legalB.contains("f5"));
    assertTrue(legalB.contains("e6"));
    assertTrue(legalB.contains("d6"));
    assertTrue(legalB.contains("f7"));
    assertTrue(legalB.contains("f8"));
    assertTrue(legalB.contains("g6"));
    assertTrue(legalB.contains("h6"));
  }
}
