public class reversearray {
   
    public static void rarray(int i, int n, int[] nums){
        if(i>=n/2){
            int temp = nums[i];
            nums[i] = nums[n-i];
            nums[n-i] = temp;
            // disp(nums);
            return ;
        }
        rarray(i+1, n, nums);
        int temp = nums[i];
        nums[i] = nums[n-i];
        nums[n-i] = temp;
        
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length-1;
        int i=0; 
        rarray(i, n, nums);
        for(int j=0; j<nums.length; j++){
            System.out.print(nums[j]+" ");
        }
        
    }
}
