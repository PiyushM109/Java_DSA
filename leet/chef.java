import java.util.*;
public class chef{
    public static void display(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        Arrays.sort(nums);
        display(nums);

        int p = nums.length-1;
        for(int j=0; j<nums.length/2; j++){
            if(nums[j]==0){
                int temp = nums[j];
                nums[j] = nums[p];
                nums[p] = temp;
                p--;
            }
        }
        display(nums);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        applyOperations(nums);
    }
}