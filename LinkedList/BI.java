public class BI {
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next = null;
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public boolean detectCycle(Node head){
        Node slow  = head; 
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BI LL = new BI();
        LL.addFirst(0);
        LL.addFirst(1);
        LL.addFirst(1);
        System.out.println(LL.detectCycle(LL.head));
        LL.display();
    }
}
