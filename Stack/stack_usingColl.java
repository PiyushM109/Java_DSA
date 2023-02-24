import java.util.*;
public class stack_usingColl {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
