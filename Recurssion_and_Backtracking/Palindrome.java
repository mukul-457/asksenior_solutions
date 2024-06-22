import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int n = sc.nextInt();

        // Example: Reading an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindrome(arr,0, n-1)){
            System.out.println("YES");;
        }else{
            System.out.println("NO");
        }
        sc.close();

    }

    public static  boolean isPalindrome(int[] arr, int start , int end){
        if ( start >= end ){
            return true;
        }

        return arr[start] == arr[end] &&  isPalindrome(arr, start+1, end-1);
    }

}
