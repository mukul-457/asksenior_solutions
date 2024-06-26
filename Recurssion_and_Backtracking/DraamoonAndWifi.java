import java.util.Scanner;

public class DraamoonAndWifi {
    static double correct_guess = 0;
    static double wrong_guess = 0;    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sent_signal = sc.nextLine();
        int  expected_postition = 0;
        for (int i=0; i<sent_signal.length(); i++){
            if(sent_signal.charAt(i) == '+'){
                expected_postition += 1;
            }else{
                expected_postition -= 1; 
            }
        }

        StringBuilder received_signal = new StringBuilder(sc.nextLine());
        sc.close();

        findCorrectAndWrongGuess(received_signal, 0, 0, expected_postition);
        double prob = correct_guess / (correct_guess + wrong_guess);
        System.out.println(prob);

    }

    static void findCorrectAndWrongGuess(StringBuilder signal , int move, int actual_pos, int expected_postition){
        if (move == signal.length()){
            if (actual_pos == expected_postition){
                correct_guess += 1;
            }else{
                wrong_guess += 1;
            }
            return;                
        }
        if (signal.charAt(move) == '+'){
            findCorrectAndWrongGuess(signal, move+1, actual_pos+1, expected_postition);
        }else if(signal.charAt(move) == '-'){
            findCorrectAndWrongGuess(signal, move+1, actual_pos-1, expected_postition);
        }else{
            findCorrectAndWrongGuess(signal, move+1, actual_pos+1, expected_postition);
            findCorrectAndWrongGuess(signal, move+1, actual_pos-1, expected_postition);
        }
    }
}
