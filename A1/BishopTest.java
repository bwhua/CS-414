
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
    assert(legal.contains("a1"));
    assert(legal.contains("b2"));
    assert(legal.contains("c3"));
    assert(legal.contains("c5"));
    assert(legal.contains("e3"));
    assert(legal.contains("f2"));
    assert(legal.contains("g1"));
    assert(legal.contains("e5"));
    assert(legal.contains("g6"));

  }
}
