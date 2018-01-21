public class RookTest {
  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Rook testRook = new Rook();
    testRook.color = ChessPiece.Color.WHITE
    Pawn whitePawn = new Pawn;
    whitePawn.color = ChessPiece.Color.WHITE;
    Pawn blackPawn = new Pawn;
    blackPawn.color = ChessPiece.Color.BLACK;

    testBoard.placePiece(testRook, "d4");
    testBoard.placePiece(whitePawn, "d6");
    testBoard.placePiece(blackPawn, "f4");
    //todo: make sure legal moves include d5, e4, f4, a4, b4, c4, d1, d2, d3
  }
}
