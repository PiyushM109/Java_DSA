import java.util.*;

public class reverseaStringusingStack {
    public static String reversString(String str){
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<str.length()){
            st.push(str.charAt(i));
            i++;
        }
        StringBuilder ans = new StringBuilder("");
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    } 
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
    public static Stack<Integer> reverseStackUsingSpace(Stack<Integer> sta, Stack<Integer> s){
        
        while(!sta.isEmpty()){
            int temp = sta.peek();
            sta.pop();
            s.push(temp);
        }
        // System.out.println(s);
        return s;

    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        reverseStack(st);
        Atbottom(st, temp);
    }
   
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> s = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // System.out.println(st.pop());
        // System.out.println(st);
        
        reverseStack(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(reversString(str));
        // System.out.println(st);

    }   
}
