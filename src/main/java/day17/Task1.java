package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] massive = {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                                ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK};

        for(ChessPiece chessPiece: massive)
        System.out.print(chessPiece.toString() +" ");
    }
}