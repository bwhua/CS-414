public class BishopTest {


  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Bishop testBishop = new Bishop();
    testBishop.color = ChessPiece.Color.WHITE;
    Pawn whitePawn = new Pawn;
    whitePawn.color = ChessPiece.Color.WHITE;
    Pawn blackPawn = new Pawn;
    blackPawn.color = ChessPiece.Color.BLACK;

    testBoard.placePiece(testBishop, "d4");
    testBoard.placePiece(whitePawn, "b6");
    testBoard.placePiece(blackPawn, "f6");
    //todo: Make sure these are in the arraylist- a1, b2, c3, c5, e3, f2, g1, e5, g6
  }
}
