public class QueenTest {

  public void testLegalMoves(){
    ChessBoard testBoard = new ChessBoard();
    Queen testQueen = new Queen();
    testQueen.color = ChessPiece.Color.WHITE;
    testBoard.placePiece(testQueen, "d4");
    //todo: make sure arraylist is empty
  }
}
