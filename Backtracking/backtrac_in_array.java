public class backtrac_in_array{
    public static void backtrack(int array[], int i, int val){
        if(i==array.length){
            print(array);
            return;
        }
        array[i] = val;
        backtrack(array, i+1, val+1);
        array[i] = array[i]-2;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int anna[] = new int[10];
        backtrack(anna, 0, 1);
        print(anna);
    }
}