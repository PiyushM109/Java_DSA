import java.util.*;
public class Queue_using_JCF {
    public static void main(String[] args) {
      Queue<Integer> qu = new LinkedList<>();
      // Queue<Integer> qu = new ArrayDeque<>();
      qu.add(1);
      qu.add(2);
      qu.add(3);
      qu.add(4);
      System.out.println(qu.remove());
      System.out.println(qu.isEmpty());
      System.out.println(qu.peek());
    }
}
