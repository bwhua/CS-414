public class KingTest {

  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    King testKing = new King();
    testKing.color = ChessPiece.Color.WHITE;
    Pawn whitePawn = new Pawn;
    whitePawn.color = ChessPiece.Color.WHITE;
    Pawn blackPawn = new Pawn;
    blackPawn.color = ChessPiece.Color.BLACK;

    testBoard.placePiece(testKing, "h4");
    testBoard.placePiece(whitePawn, "g5");
    testBoard.placePiece(blackPawn, "g3");
    //todo: make sure legal moves include g4, g3, h5, h3
  }
}
