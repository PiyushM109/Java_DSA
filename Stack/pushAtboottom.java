import java.util.*;

public class pushAtboottom {
    public static void Atbottom(Stack<Integer> st,int data){
        if(st.empty()){
            st.push(data);
            return ;
        }
        int temp = st.pop();
        Atbottom(st, data);
        st.push(temp);
        // return;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(6);
        st.push(6);
        Atbottom(st, 0);
        System.out.println(st);
        
    }
}
