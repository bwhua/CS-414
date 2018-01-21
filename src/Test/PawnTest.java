public class PawnTest {

  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Pawn testPawn = new Pawn();
    testPawn.color = ChessPiece.Color.WHITE;
    Pawn whitePawn = new Pawn;
    whitePawn.color = ChessPiece.Color.WHITE;
    Pawn blackPawn = new Pawn;
    blackPawn.color = ChessPiece.Color.BLACK;

    testBoard.placePiece(testPawn, "d4");
    testBoard.placePiece(whitePawn, "c5");
    testBoard.placePiece(blackPawn, "e5");
    //todo: make sure legal moves include d5, d6, e5
  }
}
