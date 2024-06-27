import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class forLearningBacktracking {

    public static void main(String[] args) {
        //  SubsetSolution s = new SubsetSolution();
        //  int[] inp = {1,2,3};

        //  List<List<Integer>> res = s.subsets(inp);

        //  System.out.println(res);
        // DupSubsetSolutinon s = new DupSubsetSolutinon();
        // int[] inp = {1,1,3};
        // System.out.println(s.subsets(inp));

        MyPermutations p = new MyPermutations();
        int[] inp = {1,2,3};
        System.out.println(p.subsets(inp));

    }
    
}

class SubsetSolution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    
}

class DupSubsetSolutinon{

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> curr , int[] num, int index ){
        list.add(new ArrayList<>(curr));
        for(int i = index ; i < num.length; i++){
            if (i == index || num[i] != num[i-1]){
                curr.add(num[i]);
                backtrack(list, curr, num, i+1);
                curr.remove(curr.size()-1);
            }

        }
    }

}

class MyPermutations{


    public void printmyname(){
        System.out.println("Hello");
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list,  List<Integer> curr, int[] nums ){
        if(curr.size() == nums.length){
            list.add(new ArrayList<>(curr));
        }
        for (int i =0 ; i < nums.length; i++){
            if (curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            backtrack(list, curr, nums);
            curr.remove(curr.size()-1);
        }
    }
}