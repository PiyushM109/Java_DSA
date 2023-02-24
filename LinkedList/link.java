
public class link{
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

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void addAt(int ind, int data){
            if(head==null){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i=0;
            while(i<ind-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public void removeAt(int ind){
            if(head==null){
                System.out.println("LinkedList is Empty");
            }
            Node temp = head;
            Node prev = temp;
            int i=0;
            while(i<ind){
                prev = temp;
                temp =temp.next;
                i++;
            }
            prev.next = temp.next;

        }

        public void removeFirst(){
            if(head==tail){
                head = tail = null;
                return;
            }
            head = head.next;
        }

        public void removeLast(){
            if(head==tail){
                head = tail = null;
                return;
            }
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }

        public int itrSearch(int target){
            if(head==null){
                return -1;
            }
            Node temp = head;
            int ind = 0;
            while(temp != null){
                if(temp.data==target){
                    return ind;
                }
                temp = temp.next;
                ind++;
            }
            return -1;
        }
        public int rechelpsear(Node Temp,int target){
            if(Temp.data==target){
                return 0;
            }
            else if(Temp.next==null){
                return -1;
            }

            int ind =  rechelpsear(Temp.next, target);
            if(ind==-1){
                return -1;
            }
            ind = ind+1;
            return ind;
        }
        public int recSearch(int key){
            Node temp = head;
            return rechelpsear(temp, key);
        }

        public void reverse(Node head){
            if(head==null){
                System.out.println("Linked List is empty");
                return;
            }
            Node curr =tail= head;
            Node prev = null;
            Node nxt;

            while(curr != null){
                nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
            }
            head = prev;
        }

        public Node findMid(Node head){
            Node slow  = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public boolean checkPalindrome(){
            if(head==null  || head.next==null){
                return true;
            }
            Node temp = head;
            //find mid
            Node midNode = findMid(temp);

            //revrse the half portion
            Node prev = null;
            Node curr = midNode; 
            Node nxt;
            while(curr != null){
                nxt = curr.next;
                curr.next = prev;
                prev  = curr;
                curr = nxt;
            }
            Node right = prev;
            Node left = head;
            while(right != null){
                if(right.data != left.data){
                    return false;
                }
                right = right.next;
                left = left.next;
            }
            return true;
        }
        // public void reverse(Node head){
        //     Node prev = null;
        //     Node curr = head;
        //     Node nxt;
        //     while(curr != null){
        //         nxt = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = nxt;
        //     }
        //     head = prev;
        // }
       
        public int getDecimalValue(Node head) {
            if(head==null){
                return 0;
            }
            reverse(head);
            Node temp = head;
            int ans = 0;
            int base = 1;
    
            while(temp!=null){
                int curr = temp.data;
                if(curr==1){
                    ans = ans+(curr*base);
                }
                temp = temp.next;
                base = base*2;
            }
            return ans;
        }   
        // public Node zigzag(Node head){
        //     if(head==null ||head.next==null){
        //         return head;
        //     }
        // }
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

    public static void main(String[] args) {
        link L1 = new link();
        L1.addFirst(1);
        L1.addLast(3);
        L1.addLast(5);
        
        link L2 = new link();
        L2.addFirst(2);
        L2.addLast(4);
        L2.addLast(6);
        L1.display();
        L2.display();
        
        
        
    }
}