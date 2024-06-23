import java.util.Scanner;

public class AppleDivision {

    static Long ans = 0L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        Long total = 0L;
        for (int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextLong();
            ans  += arr[i];
            total += arr[i];
        }
        trail_and_check(arr, 0, 0L, total);
        System.out.println(ans);
        sc.close();

    }

    public static void trail_and_check(Long[] arr , int candidate_index, Long curr_sum, Long total){
        if(candidate_index == arr.length){
            ans = Math.min(ans, Math.abs((total-curr_sum)-curr_sum) );
            return ;
        }
        trail_and_check(arr, candidate_index+1, curr_sum+arr[candidate_index], total);
        trail_and_check(arr, candidate_index+1, curr_sum, total);
    }
}
