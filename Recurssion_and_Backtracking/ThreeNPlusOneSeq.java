import java.util.Scanner;

public class ThreeNPlusOneSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(count_lenght(n));
        sc.close();
    }

    static int count_lenght(int n){
        if ( n== 1){
            return 1;
        }
        if ( n % 2 == 0 ){
            return 1 + count_lenght(n/2);
        }
        return 1 + count_lenght(3*n +1);
    }
}
