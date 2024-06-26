import java.util.Scanner;

public class Combination_formula {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        if (R > N){
            System.out.println(0);
            sc.close();
            return;
        }
  
        System.out.println(comb(N, R) );

        sc.close();

    }

    static Long comb(int N, int R){
        if (R == 0){
            return 1L;
        }

        return (comb(N-1, R-1) * N )/ R ;


    }
    
}
