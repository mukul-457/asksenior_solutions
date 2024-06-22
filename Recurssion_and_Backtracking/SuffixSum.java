import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SuffixSum {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int N = reader.nextInt();
        int M = reader.nextInt();

        Long[] arr  = new Long[N];

        for (int i =0; i < N; i ++ ){
            arr[i]  = reader.nextLong();
        }

        out.println(recursiveSuffixSum(arr, M, N-1));

        out.close();
 
    }

    static Long recursiveSuffixSum(Long[] arr, int j, int i ){
        if (j == 0 ){
            return 0L;
        }
        return arr[i] + recursiveSuffixSum(arr, j-1, i-1); 
    }

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
