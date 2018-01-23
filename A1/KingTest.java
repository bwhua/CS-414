import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KingTest {

  @Test
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    King testKing = new King(testBoard, ChessPiece.Color.WHITE);
    Pawn whitePawn = new Pawn(testBoard, ChessPiece.Color.WHITE);
    Pawn blackPawn = new Pawn(testBoard, ChessPiece.Color.BLACK);

    testBoard.placePiece(testKing, "h4");
    testBoard.placePiece(whitePawn, "g5");
    testBoard.placePiece(blackPawn, "g3");
    //todo: make sure legal moves include g4, g3, h5, h3
    ArrayList<String> legal = testKing.legalMoves();
    assertEquals(4, legal.size());
    assert(legal.contains("g4"));
    assert(legal.contains("g3"));
    assert(legal.contains("h5"));
    assert(legal.contains("h3"));

  }
}
