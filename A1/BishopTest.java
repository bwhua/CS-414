
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class BishopTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Bishop whiteBishop = new Bishop(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Bishop blackBishop = new Bishop(testBoard, ChessPiece.Color.BLACK);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(whiteBishop, "d4");
    testBoard.placePiece(whitePawn, "b6");
    testBoard.placePiece(blackBishop, "f6");
    testBoard.placePiece(blackPawn, "e7");


    ArrayList<String> legalW = whiteBishop.legalMoves();
    assertEquals(9, legalW.size());
    assertTrue(legalW.contains("a1"));
    assertTrue(legalW.contains("b2"));
    assertTrue(legalW.contains("c3"));
    assertTrue(legalW.contains("c5"));
    assertTrue(legalW.contains("e3"));
    assertTrue(legalW.contains("f2"));
    assertTrue(legalW.contains("g1"));
    assertTrue(legalW.contains("e5"));
    assertTrue(legalW.contains("f6"));

    ArrayList<String> legalB = blackBishop.legalMoves();
    assertEquals(6, legalB.size());
    assertTrue(legalB.contains("d4"));
    assertTrue(legalB.contains("e5"));
    assertTrue(legalB.contains("g5"));
    assertTrue(legalB.contains("g7"));
    assertTrue(legalB.contains("h4"));
    assertTrue(legalB.contains("h8"));

  }
}
