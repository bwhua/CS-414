import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PawnTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Pawn testWPawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);
    
    Pawn testBPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);
    Pawn whitePawn1 = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn1 = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testWPawn, "d2");
    testBoard.placePiece(whitePawn, "c3");
    testBoard.placePiece(blackPawn, "e3");

    testBoard.placePiece(testBPawn, "d7");
    testBoard.placePiece(whitePawn1, "c6");
    testBoard.placePiece(blackPawn1, "e6");

    //todo: make sure legalW moves include d5, d6, e5
    ArrayList<String> legalW = testWPawn.legalMoves();

    assertEquals(3,legalW.size());
    assertTrue(legalW.contains("d3"));
    assertTrue(legalW.contains("d4"));
    assertTrue(legalW.contains("e3"));


    ArrayList<String> legalB = testBPawn.legalMoves();
    assertEquals(3,legalW.size());
    assertTrue(legalB.contains("c6"));
    assertTrue(legalB.contains("d6"));
    assertTrue(legalB.contains("d5"));
  }
}
