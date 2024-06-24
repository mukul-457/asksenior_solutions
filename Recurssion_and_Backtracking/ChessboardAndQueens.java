import java.util.Scanner;


public class ChessboardAndQueens {

    static int total_solutions = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder[] board = new StringBuilder[8];
        for(int i=0; i<8; i++){
                board[i] = new StringBuilder(sc.nextLine());
        }
        count_solutions(board, 0);
        System.out.println(total_solutions);
        sc.close();
    }

    static void count_solutions(StringBuilder[] board, int r){
        if (r == 8){
            total_solutions++;
            return;
        }
        for (int c=0; c<8; c++){
            if(board[r].charAt(c) != '*'){
                board[r].setCharAt(c, 'Q');
                if (isValid(board, r, c)){
                    count_solutions(board, r+1);
                }
                board[r].setCharAt(c, '.');
            }
        }
    }
    
    static boolean isValid(StringBuilder[] board, int row , int col){
        for(int r = row-1 ; r >= 0; r--){
            if (board[r].charAt(col) == 'Q'){
                return false;
            }
        }
        for(int r=row-1, c=col-1; r>=0 && c >=0 ; r--,c-- ){
            if (board[r].charAt(c) == 'Q'){
                return false;
            }
        }

        for(int r=row-1, c=col+1; r>=0 && c <8 ; r--,c++ ){
            if (board[r].charAt(c) == 'Q'){
                return false;
            }
        }

        return true;
    }
}