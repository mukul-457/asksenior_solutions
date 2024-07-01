import java.util.Scanner;

public class reachValue {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (int t = 0; t < test_cases; t++){
            long targetValue = sc.nextLong();
            boolean isPossible = tryAndCheck(targetValue, 1);
            if (isPossible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }

    static boolean tryAndCheck(long target, long current){
        if(current > target){
            return false;
        }
        if (current == target){
            return true;
        }
        return tryAndCheck(target, current*10) || tryAndCheck(target, current*20);
    }
}
