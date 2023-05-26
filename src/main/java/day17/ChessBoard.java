package day17;

public class ChessBoard {
    private ChessPiece[][] massive;

    public ChessBoard(ChessPiece[][] massive){
        this.massive = massive;
    }

    public void print(){
        for(int i = 0; i < this.massive.length; i++){
            for (int j = 0; j < this.massive[i].length; j++){
                System.out.print(this.massive[i][j].toString());
            }
            System.out.println();
        }
    }
}
