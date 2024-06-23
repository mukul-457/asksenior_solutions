import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solveNQueens(n)); 
        sc.close();
    }

    public static  List<List<String>> solveNQueens(int n ){
        int[] pos = new int[n];
        List<List<String>> solution = new ArrayList<>();
        placeAndCheck(pos, 0, n, solution);
        return solution;
    }

    static void  placeAndCheck(int[] pos, int row, int n , List<List<String>> solution){
        if (row == n){
            addSolution(pos,solution, n);
            return; 
        }
        for(int col = 0 ; col < n ; col++){
            pos[row] = col;
            if(isValid(pos, row+1 )){
                placeAndCheck(pos, row+1, n, solution);
            }
        }
    }

    static void addSolution(int[] pos, List<List<String>> solution, int n ){
        List<String>  sol = new ArrayList<>();
        for (int col : pos) {
            StringBuilder curr_row  = new StringBuilder();
            for (int s = 0; s < col; s ++  ){
                curr_row.append(".");
            }
            curr_row.append("Q");
            for (int s = 0; s < (n-col-1); s++){
                curr_row.append(".");
            }

            sol.add(curr_row.toString());
        }

        solution.add(sol);

    }

    static boolean isValid(int[] positions , int no_of_queens ){

        for (int i = 0; i < no_of_queens; i++){
            for (int j=i+1; j < no_of_queens; j++){
                if (positions[i] == positions[j] || j-i == Math.abs(positions[i] - positions[j]) ){
                    return false;
                }
            }
        }

        return true;
    }
}