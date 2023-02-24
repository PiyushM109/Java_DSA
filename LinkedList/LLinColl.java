import java.util.*;

public class LLinColl{
   
   public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addFirst(3);
    list.addLast(4);
    list.addFirst(2);
    System.out.println(list.indexOf(4));
    System.out.println(list);
   }
   
}