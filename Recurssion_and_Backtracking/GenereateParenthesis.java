import java.util.ArrayList;
import java.util.List;

public class GenereateParenthesis {
    public static void main(String[] args) {
        NewSolution s = new NewSolution();
        System.out.println(s.generateParenthesis(3));
    }    
}

class NewSolution {
    public List<String> generateParenthesis(int n) {
        List<String>  allCombs = new ArrayList<>();
        StringBuilder currComb = new StringBuilder();
        generate(currComb , allCombs , n ,n );
        return allCombs;
    }

    public void generate(StringBuilder currComb , List<String> allCombs , int open, int closed){
        if (open == 0 && closed == 0 ){
            allCombs.add(new String(currComb));
            return;
        }
        if (open < closed &&  closed > 0){
            currComb.append(')');
            generate(currComb, allCombs, open, closed-1);
            currComb.deleteCharAt(currComb.length()-1);
        }
        if (open > 0){
            currComb.append('(');
            generate(currComb, allCombs, open-1, closed);
            currComb.deleteCharAt(currComb.length()-1);
        }
    }
}