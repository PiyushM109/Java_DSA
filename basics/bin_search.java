import java.util.*;
public class bin_search{
    public static int binary_search(int array[],int key){
            int start = 0;
            int end = array.length-1;
            while(start<=end){
               int mid = (start+end)/2;
               if(array[mid]==key){
                    return mid;
               }
               if(array[mid]<key){
                   start = mid+1;
               }
               if(array[mid]>key){
                   end = mid-1;
               }

            }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[10];
        for(int i=0; i<marks.length; i++){
                marks[i]=sc.nextInt();
        }
        System.out.println("Enter the key that you want to search : ");
        int key = sc.nextInt();
        int pos = binary_search(marks, key);
        System.out.println(pos);

    }
}