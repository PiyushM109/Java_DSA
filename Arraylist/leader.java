import java.util.*;
public class leader{
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int j=0;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>list.get(j)){
                list.add(arr[i]);
                j++;
                System.out.println(list);
            }
        }
        Collections.reverse(list);
       System.out.println(list);
    }
}