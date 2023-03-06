import java.rmi.server.RemoteServer;
import java.util.*;
public class Implement_queue_using_deque {
    static class myqueue{
        static Deque<Integer> dq = new LinkedList<>();

        public static void add(int x){
            dq.addLast(x);
        }

        public static int remove(){
            return dq.removeFirst();
        }

        public static int peek(){
            return dq.peek();
        }

        public static boolean isEmpty(){
            return dq.isEmpty();
        }
    }
    public static void main(String[] args) {
        myqueue q = new myqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
