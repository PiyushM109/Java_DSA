public class first_occurence {
    public static int firstoc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int array[] = {7,8,7,5,9,1,9,7,6,6};
        System.out.println(firstoc(array, 2, 0));
    }
    
}
