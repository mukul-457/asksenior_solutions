import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution s  = new Solution();
        System.out.println(s.subsets(new int[]{1,2,3}));
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> solutions = new ArrayList<>();
        List<Integer> currSubset = new ArrayList<>();
        createSubset(nums, currSubset, 0,solutions);
        return solutions;
    }

    public void createSubset(int[] nums , List<Integer> currSubset, int index, List<List<Integer>> solutions){
        if (index == nums.length){
            solutions.add(new ArrayList<>(currSubset));
            return;
        }
        currSubset.add(nums[index]);
        createSubset(nums , currSubset, index+1,solutions);
        currSubset.remove(currSubset.size()-1);
        createSubset(nums, currSubset, index+1, solutions);

    }
}
