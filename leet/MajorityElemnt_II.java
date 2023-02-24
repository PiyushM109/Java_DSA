import java.util.ArrayList;

import java.util.*;
public class MajorityElemnt_II {
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=(nums.length/3);
        int check = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                check++;
                if(check>=n){
                    ans.add(nums[i]);
                }
            }
            else{
                check=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
