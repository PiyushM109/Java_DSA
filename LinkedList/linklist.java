public class linklist {
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

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void display(){
            if(head==null){
                System.out.println("LinkedList is Empty");
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
        public Node Findmid(Node head){
            Node slow = head;
            Node fast= head;
            Node prev = slow;
            while(fast!=null || fast.next!=null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            return slow;
        }
        public void zigzag(Node head){
            if(head==null || head.next==null){
                System.out.println("Aready Sorted");
                return ;
            }
            Node right = Findmid(head);
            Node curr = right;
            Node prev = curr;
            Node nxt;
            while(curr.next!=null){
                nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
            }
            right = prev;
            Node left = head;
            while(right.next!=null || left.next!=null){
                Node temp = right;
                right = right.next;
                temp.next = left.next;
                left.next = temp;
                left = left.next.next;
            }
            if(right==null && .next)

            
        }

}
