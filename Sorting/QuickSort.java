public class QuickSort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void quick(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr, si, ei)
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);
    }
    public static int partition(int array[],int si, int ei){

    }
    
}
