public class stack_usingLinkedlist {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    
    
    public static class Stack{
        public static Node head = null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return ;
            }
            Node temp = head;
            head = newNode;
            head.next = temp;
        }

        public static int peek(){
            return head.data;
        }

        public static int pop(){
            if(isEmpty()){
                return-1;
            }
            int ans = head.data;
            head = head.next;
            return ans;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
