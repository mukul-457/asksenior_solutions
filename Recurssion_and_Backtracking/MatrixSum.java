import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MatrixSum {
    
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        // Read the input
        int R = reader.nextInt();
        int C = reader.nextInt();

        // Reading an array
        int[][] arr1 = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++){
                arr1[i][j] = reader.nextInt();
            }

        }

        int[][] arr2 = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++){
                arr2[i][j] = reader.nextInt();
            }

        }

        sumMatrix(arr1, arr2, R, C, R-1, C-1);

        // Close the output stream
        out.close();
    }

    public static void sumMatrix(int[][] arr1,  int[][] arr2 , int R, int C , int row , int col) {
        //System.out.printf("called with row = %d and col = %d" ,row, col);
        if (row == -1){
            return; 
        }
        if (col == -1){
            sumMatrix(arr1, arr2, R, C, row-1, C-1);
        }else{
            sumMatrix(arr1, arr2, R, C, row, col-1);
            System.out.print(arr1[row][col] + arr2[row][col]);
            System.out.print(" ");
            if  (col == C-1 && row != R-1){
                System.out.println();
            }

        }

    }

    // Fast input reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
