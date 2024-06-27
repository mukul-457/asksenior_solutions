import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    
    public static List<List<Integer>> permute(int[] nums){
        int n  = nums.length;
        boolean[] isSelected = new boolean[n];
        for (int i =0 ; i < 0 ; i ++ ){
            isSelected[i]  = false;
        }
        List<List<Integer>> solution = new ArrayList<>();
        List<Integer> curr_permute = new ArrayList<>();
        do_permute(nums, isSelected,n,curr_permute, solution);
        return solution;
    }

    public static void do_permute(int[] arr, boolean[] isSelected, int n , List<Integer> curr_permutation, List<List<Integer>> solution){
        if (curr_permutation.size() == n){
            solution.add(new ArrayList<>(curr_permutation));
            return;
        }
        for (int i=0; i < n; i ++){
            if(!isSelected[i]){
                curr_permutation.add(arr[i]);
                isSelected[i] = true;
                do_permute(arr, isSelected, n, curr_permutation, solution);
                isSelected[i] = false;
                curr_permutation.remove(curr_permutation.size() -1);
            }
        }

    }
    
}
