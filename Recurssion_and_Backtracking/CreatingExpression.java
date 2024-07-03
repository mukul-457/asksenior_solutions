import java.util.Scanner;

public class CreatingExpression {

    static boolean possible = false;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in );
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i < N; i ++){
            arr[i] = sc.nextInt();
        }
        checkIfPossible(1, arr, arr[0], X);
        if (possible){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    
    static void checkIfPossible(int index,  int[] arr, int curr_sum , int X){
        if (index == arr.length){
            if (curr_sum == X ){
                possible = true;
            }
            return;
        }
        checkIfPossible(index+1, arr, curr_sum+arr[index], X);
        checkIfPossible(index+1, arr, curr_sum-arr[index], X);

    }
}
