import java.util.ArrayList;
public class Stack_using_Alist {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean chEpmty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
            return ;
        }
        public static int pop(){
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
        public static int removebottom(){
            int temp = list.get(0);
            list.remove(0);
            return temp;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.list);
        s.removebottom();
        System.out.println(s.list);

    }
}
