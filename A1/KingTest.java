import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KingTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    King whiteKing = new King(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    King blackKing = new King(testBoard, ChessPiece.Color.BLACK);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(whiteKing, "h4");
    testBoard.placePiece(whitePawn, "g5");
    testBoard.placePiece(blackKing, "h3");
    testBoard.placePiece(blackPawn, "g2");

    //todo: make sure legal moves include g4, g3, h5, h3
    ArrayList<String> legalW = whiteKing.legalMoves();
    assertEquals(4, legalW.size());
    assertTrue(legalW.contains("g4"));
    assertTrue(legalW.contains("g3"));
    assertTrue(legalW.contains("h5"));
    assertTrue(legalW.contains("g3"));

    ArrayList<String> legalB = blackKing.legalMoves();
    assertEquals(4, legalB.size());
    assertTrue(legalB.contains("h2"));
    assertTrue(legalB.contains("g3"));
    assertTrue(legalB.contains("g4"));
    assertTrue(legalB.contains("h4"));

  }
}
