import java.util.*;
public class distinct{
    public static void main(String[] args) {
        int[] arr ={1,2,1,2,3,4,3,4,5,5,6,6,7,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}