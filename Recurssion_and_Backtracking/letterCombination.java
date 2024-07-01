import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class letterCombination {
    static Map<Character,String> numToLetter = new HashMap<>();

    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        System.out.println(letterCombinations(digits));
        sc.close();
        
    }

    public static List<String> letterCombinations(String digits){
        if(digits.length() ==0 ){
            return new ArrayList<>();
        }
        numToLetter.put('2', "abc");
        numToLetter.put('3',"def");
        numToLetter.put('4',"ghi");
        numToLetter.put('5',"jkl");
        numToLetter.put('6',"mno");
        numToLetter.put('7', "pqrs");
        numToLetter.put('8',"tuv");
        numToLetter.put('9', "wxyz");
        List<String> combs = new ArrayList<>();
        findCombs(digits, 0, combs, new StringBuilder());
        return combs;        
    }

    static void findCombs(String digits, int index, List<String> ans, StringBuilder currComb){
        if (index == digits.length() ){
            ans.add(new String(currComb));
            return ;
        }

        String letters = numToLetter.get(digits.charAt(index));
        for (int i= 0 ; i < letters.length() ; i ++){
            Character c = letters.charAt(i);
            currComb.append(c);
            findCombs(digits, index+1, ans, currComb);
            currComb.deleteCharAt(currComb.length()-1);
        }

    }


}
