import java.util.ArrayList;
import java.util.Collections;

public class Swap2 {
    public static void swap(int ind1, int ind2,ArrayList<Integer>list){
        // int temp1 = list.get(ind1);
        // int temp2 = list.get(ind2);
        // list.remove(ind1);
        // list.add(ind1,temp2);
        // list.remove(ind2);
        // list.add(ind2,temp1);
        int temp = list.get(ind1);
        list.set(ind1,list.get(ind2));
        list.set(ind2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>piyu= new ArrayList<>();
        piyu.add(2);
        piyu.add(4);
        piyu.add(6);
        piyu.add(8);
        piyu.add(10);
        piyu.add(12);
        swap(2, 5, piyu);
        System.out.println(piyu);
        Collections.sort(piyu);
        System.out.println(piyu);
        Collections.sort(piyu,Collections.reverseOrder());
        System.out.println(piyu);
        
        
    }
}
