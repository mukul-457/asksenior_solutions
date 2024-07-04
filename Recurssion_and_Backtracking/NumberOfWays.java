import java.util.Scanner;


public class NumberOfWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start  = sc.nextInt();
        int End  = sc.nextInt();
        //System.out.println(count(start, End)); this one was faster on codeforces
        System.out.println(count(End-start));
        sc.close();
    }

    // static int count(int start , int End){
    //     if (start == End){
    //         return 1;
    //     }
    //     if (start > End){
    //         return 0;
    //     }
    //     return count(start+1, End) + count(start+2, End) + count(start+3, End);
    // }

    static int count(int diff){
        if (diff == 0 || diff == 1){
            return 1;
        }
        if (diff == 2){
            return 2;
        }
        if (diff == 3){
            return 4;
        }
        return count(diff-3) + count(diff-2) + count(diff-1);
        
    }
}
