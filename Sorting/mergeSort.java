public class mergeSort {
    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergesort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        mergesort(array, si, mid);
        mergesort(array, mid + 1, ei);
        merge(array, si, ei, mid);
    }

    public static void merge(int array[], int si, int ei, int mid) {
        int temp[] = new int[ei - si+1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid + 1 && j <= ei) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
              
            } else {
                temp[k] = array[j];
                
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= ei) {
            temp[k++] = array[j++];
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,1,3,5,8,6};
        mergesort(arr, 0, arr.length-1);
    }
}
