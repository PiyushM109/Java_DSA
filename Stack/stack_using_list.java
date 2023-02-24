public class stack_using_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static class Stack {
        public static Node head=null;
        public static boolean ifEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp=head;
            head = newNode;
            head.next = temp;
        }
        public static int pop(){
            if(ifEmpty()==true){
                return -1;
            }
            int ans = head.data;
            head = head.next;
            return ans;
        }
        public static int peek(){
            return head.data;
        }
        public static void pushAtBottom(int data){
            if(ifEmpty()==true){
                push(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            return ;
        }
        public static int popAtBottom(){
            if(ifEmpty()==true){
                System.out.println("Empty Stack");
                return -1;
            }
            Node curr = head;
            Node prev = head;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            int ans = curr.data;
            prev.next = null;
            return ans;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pushAtBottom(0);
        System.out.println(st.popAtBottom());
        // System.out.println(st.peek());
        while(st.ifEmpty()==false){
            System.out.println(st.pop());
        }
    }

}
