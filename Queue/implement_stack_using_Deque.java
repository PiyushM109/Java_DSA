import java.util.*;
public class implement_stack_using_Deque {
    static class mystack{
        static  Deque<Integer> dq = new LinkedList<>();

        public static void push(int x){
            dq.addLast(x);
        }

        public static int pop(){
            return dq.removeLast();
        }

        public static int peek(){
            int temp = dq.removeLast();
            dq.addLast(temp);
            return temp;
        }

        public static boolean isEmpty(){
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        mystack st = new mystack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
