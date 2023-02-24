public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            newNode.next = null;
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail= newNode;
            // newNode.next = null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        // tail.next = null;
    } 
    public void display(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            
            temp = temp.next;
        }
        System.out.println();
    }
    public void addAtIndex(int ind, int data){
        if(head==null){
            addFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        for(int i=0; i<ind-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addlast(7);
        ll.addlast(9);
        ll.display();
        System.out.println(ll.size);
        ll.addAtIndex(2, 18);
        ll.display();
        System.out.println(ll.size);
        // while();
    }
}
