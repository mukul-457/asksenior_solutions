import java.util.Scanner;

public class Knapsack{

    static int max_val = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[][] wv = new int[N][2];

        for (int i = 0 ; i < N; i ++){
            int w  = sc.nextInt();
            int v  = sc.nextInt();
            int[] currwv = {w,v};
            wv[i] = currwv;
        }

        find_max_value(N, W, wv, 0, 0);

        System.out.println(max_val);


        sc.close();
    }

    static void find_max_value(int N , int cap, int[][]arr, int index, int currval){
        if (cap >= 0 ){
            max_val = Math.max(max_val, currval);
        }        
        if (N == 0 ){
            return;
        }
        find_max_value(N-1, cap-arr[index][0], arr, index+1, currval+arr[index][1]);
        find_max_value(N-1, cap, arr, index+1, currval);
    }


}