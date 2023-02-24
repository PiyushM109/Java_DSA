public class rotate_arr {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotate(int[] nums, int k){
        int[] ans = new int[nums.length];
        int p=0;
        for(int i=k+1; i<nums.length; i++){
            ans[p]=nums[i];
            p++;
        }
        for(int j=0; j<k+1; j++){
            ans[p] = nums[j];
            p++;
        }
        display(ans);
    }

    public static void main(String[] args) {
        int[] nums = { -1,-100,3,99};
        
        rotate(nums, 2);
        
    }
}
