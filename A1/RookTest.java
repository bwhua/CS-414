import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class RookTest {
  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Rook testRook = new Rook(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testRook, "d4");
    testBoard.placePiece(whitePawn, "d6");
    testBoard.placePiece(blackPawn, "f4");
    //todo: make sure legal moves include d5, e4, f4, a4, b4, c4, d1, d2, d3
    ArrayList<String> legal = testRook.legalMoves();
    assertEquals(9, legal.size());
    assert(legal.contains("d5"));
    assert(legal.contains("e4"));
    assert(legal.contains("f4"));
    assert(legal.contains("a4"));
    assert(legal.contains("b4"));
    assert(legal.contains("c4"));
    assert(legal.contains("d4"));
    assert(legal.contains("d1"));
    assert(legal.contains("d3"));
  }
}
