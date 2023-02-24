import java.util.*;

public class secondlargest {
    public static int largets(int[] arr) {
        int flarg = Integer.MIN_VALUE;
        int slarg = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>flarg){
                slarg = flarg;
                flarg = arr[i];
                
            }
            else if(arr[i]>slarg && arr[i]<flarg){
                slarg = arr[i]; 
            }
        }
        return slarg;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,7,6,3};
        System.out.println(largets(arr));
    }
}
