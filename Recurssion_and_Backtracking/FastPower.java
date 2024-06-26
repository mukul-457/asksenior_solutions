import java.util.Scanner;

public class FastPower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int power = sc.nextInt();

        System.out.println(fastPower(number, power));
        sc.close();
    }
    
    static double fastPower(double num , int pow){
        if (pow == 0){
            return 1;
        }
        if (pow == 1){
            return num;
        }else if(pow == -1){
            return 1/num;
        }
        if (pow %2 == 0 ){
            return fastPower(num*num, pow/2);
        }else{
            if (pow > 0 ){
                return num* fastPower(num*num, pow/2);
            }else{
                return fastPower(num*num, pow/2)/ num;
            }
        }
    }
}
