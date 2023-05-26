package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece queenWhite  = ChessPiece.QUEEN_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece empty = ChessPiece.EMPTY;

        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                                                    {rookBlack, empty,empty, empty,empty, rookBlack,kingBlack, empty},
                                                    {empty, rookWhite,empty, empty,pawnBlack, pawnBlack,empty, pawnBlack},
                                                    {pawnBlack, empty,knightBlack, empty,empty, empty,pawnBlack, empty},
                                                    {queenBlack, empty,empty, bishopWhite,empty, empty,empty, empty},
                                                    {empty, empty,empty, bishopBlack,pawnWhite, empty,empty, empty},
                                                    {empty, empty,empty, empty,bishopWhite, pawnWhite,empty, empty},
                                                    {pawnWhite, empty,empty, queenWhite,empty, pawnWhite,empty, pawnWhite},
                                                    {empty, empty,empty, empty,empty, rookWhite,kingWhite, empty}});

        chessBoard.print();
    }
}

