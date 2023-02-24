public class maxsubarray_prefix {
    public static int maxsumofsubarray(int[] nums){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                if(start==0){
                    currsum = prefix[end];
                }
                else{
                currsum = prefix[end]-prefix[start-1];
                }
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsumofsubarray(nums));
    }
}
