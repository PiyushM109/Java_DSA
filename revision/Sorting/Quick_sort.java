public class Quick_sort {
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Quicksort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        Quicksort(arr, si, pidx-1);
        Quicksort(arr, pidx+1, ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=0; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,3,8,5,4};
        Quicksort(arr, 0, arr.length-1);
        display(arr);
    }
}
