
public class merge_sort {

    public static void display(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int idx =0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[idx] = nums[left];
                left++;
            }
            else{
                temp[idx] =nums[right];
                right++;
            }
            idx++;
        }
        if(left>mid && right<=high){
            while(right<=high){
                temp[idx]=nums[right];
                idx++;
                right++;
            }
        }
        if(right>high && left<=mid){
            while(left<=mid){
                temp[idx]=nums[left];
                idx++;
                left++;
            }
        }
        for(int i=0 ,k=low; i<temp.length; k++, i++){
            nums[k] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,0,1,3,5,8,6};
        display(arr);
        mergeSort(arr, 0, arr.length-1);
        display(arr);
    }
    
}
