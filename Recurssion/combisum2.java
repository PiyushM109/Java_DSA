import java.util.*;
public class combisum2 {
    
    public static void combination(int ind,int[] nums, ArrayList<ArrayList<Integer>> ans, int target,ArrayList<Integer> ds){
        if(ind==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[ind]<=target){
            ds.add(nums[ind]);
            combination(ind+1, nums, ans, target-nums[ind], ds);
            ds.remove(ds.size()-1);
        }

        combination(ind+1, nums, ans, target, ds);
    }
    public static ArrayList<ArrayList<Integer>> combinationsum2(int[] candidates, int target){
        Arrays.sort(candidates);
        // for(int i=0; i<candidates.length-1; i++){
        //     if(candidates[i]==candidates[i+1]){

        //     }
        // }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combination(0, candidates, ans, target, new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationsum2(candidates, 8));
    }
}
