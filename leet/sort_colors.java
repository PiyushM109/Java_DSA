public class sort_colors {
    public static void sort(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] color = {2,0,2,1,1,0};
        sort(color);
        for(int i=0 ;i<color.length; i++){
            System.out.print(color[i]+" ");
        }

    }
}
