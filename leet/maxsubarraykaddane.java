public class maxsubarraykaddane {
    public static int maxsumofsubarray(int[] nums){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currsum = currsum+nums[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsumofsubarray(nums));
    }
}
