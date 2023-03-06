import java.util.*;
public class double_ended_queue {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(3);
        deque.addFirst(6);
        deque.addFirst(1);
        deque.addLast(4);
        deque.add(5);
        System.out.println(deque.remove(6));
        System.out.println(deque.peek());
        System.out.println(deque);
    }
}
