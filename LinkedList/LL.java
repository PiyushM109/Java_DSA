public class LL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp = head;
        head= newNode;
        head.next=temp;
        return;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(-1);
        list.addFirst(4);
        list.display();
    }
}
