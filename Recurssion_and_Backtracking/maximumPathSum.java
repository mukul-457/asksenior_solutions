import java.util.Scanner;

public class maximumPathSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Long[][] mat = new Long[N][M];
        for (int i =0 ; i < N ; i++){
            for (int j = 0; j < M ; j ++){
                mat[i][j] = sc.nextLong();
            }
        }

        System.out.println(findMaxPathSum(mat, N, M , 0,0));
        sc.close();
    }

    static Long  findMaxPathSum(Long[][] mat, int rows, int cols, int curr_row, int curr_col){
        if (curr_row == rows-1 && curr_col == cols-1){
            return mat[curr_row][curr_col];
        }
        else if(curr_row == rows-1){
            return mat[curr_row][curr_col] + findMaxPathSum(mat, rows, cols, curr_row, curr_col+1); 
        }
        else if(curr_col == cols-1){
            return mat[curr_row][curr_col] + findMaxPathSum(mat, rows, cols, curr_row+1, curr_col);
        }
        return mat[curr_row][curr_col] + Math.max(findMaxPathSum(mat, rows, cols, curr_row, curr_col+1), findMaxPathSum(mat, rows, cols, curr_row+1, curr_col));
    }
    
}
