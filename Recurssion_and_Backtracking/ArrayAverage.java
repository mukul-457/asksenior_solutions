import java.util.Scanner;

public class ArrayAverage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i =0; i < N ; i ++){
            arr[i] = sc.nextDouble();
        }

        
        System.out.printf("%.6f", avg(arr, N-1));
        sc.close();

    }

    static double avg(double[] arr ,  int curr_idx){
        if (curr_idx ==0 ){
            return arr[curr_idx];
        }
        double prv_avg = avg(arr, curr_idx-1);
        return (arr[curr_idx] + prv_avg*(curr_idx))/(curr_idx+1);

    }
}


