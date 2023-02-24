import java.util.*;
public class noOfSub {
    public static void numSubarrayBoundedMax(int[] nums, int left, int right) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=left && nums[i]<=right){
                list.add(nums[i]);
            }
            for(int j=i+1; j<nums.length; j++){  
                int sum = nums[i]+nums[j];
                if(sum>=left && sum<=right){
                    list.add(nums[i],nums[j]);
                }
            }
        }
        // return count;
    }
    public static void main(String[] args) {
        int[] num={2,9,2,5,6};
        numSubarrayBoundedMax(num, 2, 8);
    }
}
