public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(){
        board = new ChessPiece[8][8];
    }

    //todo: implement to make board into the opening positions
    public void initialize(){
      board = new ChessPiece[8][8];
      // making & placing white pieces
      Rook wRook1 = new Rook();
      Knight wKnight1 = new Knight();
      Bishop wBishop1 = new Bishop();
      King wKing = new King();
      Queen wQueen = new Queen();
      Bishop wBishop2 = new Bishop();
      Knight wKnight2 = new Knight();
      Rook wRook2 = new Rook();
      Pawn wPawn1 = new Pawn();
      Pawn wPawn2 = new Pawn();
      Pawn wPawn3 = new Pawn();
      Pawn wPawn4 = new Pawn();
      Pawn wPawn5 = new Pawn();
      Pawn wPawn6 = new Pawn();
      Pawn wPawn7 = new Pawn();
      Pawn wPawn8 = new Pawn();

      wRook1.color = ChessPiece.Color.WHITE;
      wKnight1.color = ChessPiece.Color.WHITE;
      wBishop1.color = ChessPiece.Color.WHITE;
      wKing.color = ChessPiece.Color.WHITE;
      wQueen.color = ChessPiece.Color.WHITE;
      wBishop2.color = ChessPiece.Color.WHITE;
      wKnight2.color = ChessPiece.Color.WHITE;
      wRook2.color = ChessPiece.Color.WHITE;
      wPawn1.color = ChessPiece.Color.WHITE;
      wPawn2.color = ChessPiece.Color.WHITE;
      wPawn3.color = ChessPiece.Color.WHITE;
      wPawn4.color = ChessPiece.Color.WHITE;
      wPawn5.color = ChessPiece.Color.WHITE;
      wPawn6.color = ChessPiece.Color.WHITE;
      wPawn7.color = ChessPiece.Color.WHITE;
      wPawn8.color = ChessPiece.Color.WHITE;

      placePiece(wRook1, "a1");
      placePiece(wKnight1, "b1");
      placePiece(wBishop1, "c1");
      placePiece(wKing, "d1");
      placePiece(wQueen, "e1");
      placePiece(wBishop2, "f1");
      placePiece(wKnight2, "g1");
      placePiece(wRook2, "h1");
      placePiece(wPawn1, "a2");
      placePiece(wPawn2, "b2");
      placePiece(wPawn3, "c2");
      placePiece(wPawn4, "d2");
      placePiece(wPawn5, "e2");
      placePiece(wPawn6, "f2");
      placePiece(wPawn7, "g2");
      placePiece(wPawn8, "h2");

      //making/placing black pieces
      Rook bRook1 = new Rook();
      Knight bKnight1 = new Knight();
      Bishop bBishop1 = new Bishop();
      King bKing = new King();
      Queen bQueen = new Queen();
      Bishop bBishop2 = new Bishop();
      Knight bKnight2 = new Knight();
      Rook bRook2 = new Rook();
      Pawn bPawn1 = new Pawn();
      Pawn bPawn2 = new Pawn();
      Pawn bPawn3 = new Pawn();
      Pawn bPawn4 = new Pawn();
      Pawn bPawn5 = new Pawn();
      Pawn bPawn6 = new Pawn();
      Pawn bPawn7 = new Pawn();
      Pawn bPawn8 = new Pawn();

      bRook1.color = ChessPiece.Color.BLACK;
      bKnight1.color = ChessPiece.Color.BLACK;
      bBishop1.color = ChessPiece.Color.BLACK;
      bKing.color = ChessPiece.Color.BLACK;
      bQueen.color = ChessPiece.Color.BLACK;
      bBishop2.color = ChessPiece.Color.BLACK;
      bKnight2.color = ChessPiece.Color.BLACK;
      bRook2.color = ChessPiece.Color.BLACK;
      bPawn1.color = ChessPiece.Color.BLACK;
      bPawn2.color = ChessPiece.Color.BLACK;
      bPawn3.color = ChessPiece.Color.BLACK;
      bPawn4.color = ChessPiece.Color.BLACK;
      bPawn5.color = ChessPiece.Color.BLACK;
      bPawn6.color = ChessPiece.Color.BLACK;
      bPawn7.color = ChessPiece.Color.BLACK;
      bPawn8.color = ChessPiece.Color.BLACK;

      placePiece(bRook1, "a8");
      placePiece(bKnight1, "b8");
      placePiece(bBishop1, "c8");
      placePiece(bKing, "d8");
      placePiece(bQueen, "e8");
      placePiece(bBishop2, "f8");
      placePiece(bKnight2, "g8");
      placePiece(bRook2, "h8");

    }

    //todo: The position is represented as a two-character string The first letter is in lowercase (a..h) and the second letter is a digit 1-8
    //throw exception if these aren't met
    public ChessPiece getPiece(String position){
        return null;
    }

    //todo: This method tries to place the given piece at a given position, and returns true if successful,
    public boolean placePiece(ChessPiece piece, String position){
        return false;
    }

    //todo: this method checks if moving the piece from the fromPosition to toPosition is a legal move
    public void move(String fromPosition, String toPosition) throws IllegalMoveException{}

    public String toString(){
        String chess="";
        String upperLeft = "\u250C";
        String upperRight = "\u2510";
        String horizontalLine = "\u2500";
        String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
        String verticalLine = "\u2502";
        String upperT = "\u252C";
        String bottomLeft = "\u2514";
        String bottomRight = "\u2518";
        String bottomT = "\u2534";
        String plus = "\u253C";
        String leftT = "\u251C";
        String rightT = "\u2524";

        String topLine = upperLeft;
        for (int i = 0; i<7; i++){
            topLine += horizontal3 + upperT;
        }
        topLine += horizontal3 + upperRight;

        String bottomLine = bottomLeft;
        for (int i = 0; i<7; i++){
            bottomLine += horizontal3 + bottomT;
        }
        bottomLine += horizontal3 + bottomRight;
        chess+=topLine + "\n";

        for (int row = 7; row >=0; row--){
            String midLine = "";
            for (int col = 0; col < 8; col++){
                if(board[row][col]==null) {
                    midLine += verticalLine + " \u3000 ";
                } else {midLine += verticalLine + " "+board[row][col]+" ";}
            }
            midLine += verticalLine;
            String midLine2 = leftT;
            for (int i = 0; i<7; i++){
                midLine2 += horizontal3 + plus;
            }
            midLine2 += horizontal3 + rightT;
            chess+=midLine+ "\n";
            if(row>=1)
                chess+=midLine2+ "\n";
        }

        chess+=bottomLine;
        return chess;
    }
}
