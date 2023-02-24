public class immediate_smalle {
    public static void immediateSmaller(int arr[], int n) {
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.print(arr[i+1]+" ");
            }
            else if(arr[i]<arr[i+1]){
                System.out.print("-1 ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 2, 1, 5, 3};
        immediateSmaller(arr, n);
    }
    
}
