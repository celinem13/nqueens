import java.util.*;
public class Board {
    public int n;
    public char[][] board;

     public Board(){
         int nSize = n;
         char[][] nSizedBoard = new char[nSize][nSize];
         for (int i = 0; i < nSize; i++){
             for (int j = 0; j < nSize; j++){
                 nSizedBoard[i][j] = '0';
             }
         }
         board = nSizedBoard;
     }

    public Board(int givenN){
        int nSize = givenN;
        char[][] nSizedBoard = new char[nSize][nSize];
        for (int i = 0; i < nSize; i++){
            for (int j = 0; j < nSize; j++){
                nSizedBoard[i][j] = '0';
            }
        }
        board = nSizedBoard;
    }

    public void changeChar(int xCoord, int yCoord, char ch){
         board[xCoord][yCoord] = ch;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void getBoard() {
        for (int i = 0; i < getN(); i++){
            for (int j = 0; j < getN(); j++){
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
