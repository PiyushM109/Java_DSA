public class quick_sort {

    public static void display(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void quickS(int nums[], int low, int high){
        if(low<high){
        int part = partition(nums, low, high);
        quickS(nums, low, part-1);

        quickS(nums, part+1, high); 
        }
    }
    public static int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i= low;
        int j = high;
        while(i<j){
            while(nums[i]<=pivot && i<high){
                i++;
            }
            while(nums[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = nums[i];
                nums[j] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {2,0,1,3,5,8,6};
        display(arr);
        quickS(arr, 0, arr.length-1);
        display(arr);
    }
}
