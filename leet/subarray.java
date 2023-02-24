public class subarray{
    public static int printsubarray(int[] nums){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=0; j<nums.length; j++){
                int end = j;
                currsum = 0;
                for(int k =start; k<=end; k++){
                    currsum = currsum+nums[k];
                }
                maxsum = Math.max(currsum, maxsum);
                
            }
            
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(printsubarray(nums));
    }
}