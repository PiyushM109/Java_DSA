import java.util.*;
public class nextGreater {
    public static int[] next_greater(int nums[], int[] ans){
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            while((!s.empty()) && nums[i]>nums[s.peek()]){
                s.pop();
            }
            if((!s.isEmpty()) && nums[i]<nums[s.peek()]){
                ans[i] = nums[s.peek()];
                s.push(i);
            }
            else if(s.isEmpty()){
                ans[i] = -1;
                s.push(i);
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {6,8,0,1,3};
        int[] ans = new int[nums.length];
        next_greater(nums, ans);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}
