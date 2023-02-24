import java.util.*;

import javax.print.event.PrintJobListener;
public class dynamic_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            int p = sc.nextInt();
            list1.add(p*1);
            list1.add(p*2);
            list1.add(p*3);
            list.add(list1);
        }
        System.out.println(list);
    }
}
