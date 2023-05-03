import java.util.*;
public class pre_in_post_traversal {
    public static class Node{
        int data;
        Node left; 
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public class Pair<T, U> {
        private final T first;
        private final U second;
    
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    
        public T getFirst() {
            return first;
        }
    
        public U getSecond() {
            return second;
        }
    }
    
    public static class bt{
        static int idx = -1;
        public static Node build(int[] nodes){
            idx++;
            if(idx==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }
    public static void preInPost(Node root){
        
        Stack<Pair> st = new Stack<>();
    }

}
