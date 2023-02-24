public class reversearr {
    public static void reverse(int[] arr){
        int n = arr.length-1;
        
        for(int i=0; i<=n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        reverse(nums);
    }
}
