class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.lenght; j++){
                if(nums[i]+nums[j]==target){
                   arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {2,7,11,15};
        int n = 9;
        System.out.println(twoSum(array,n));
    }
}