import java.util.*;
public class iterative_preorder {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class binaryTree{
        static int idx = -1;
        public static Node buildBinaryTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);

            return newNode;
        }
        public static List<Integer> preorder_traversal(Node root){
            ArrayList<Integer> preorder = new ArrayList<>();
            if(root==null){
                return preorder;
            }
            Stack<Node> st = new Stack<Node>();
            st.push(root);
            while(!st.isEmpty()){
                root = st.pop();
                preorder.add(root.data);
                if(root.right != null){
                    st.push(root.right);
                }
                if(root.left != null){
                    st.push(root.left);
                }
            }
            return preorder;
        }

        public static List<Integer> inorder_traversal(Node root){
            ArrayList<Integer> inorder = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            Node node = root;
            if(root==null){
                return inorder;
            }
            st.push(root);
            while(true){
                if(node != null){
                    st.push(node);
                    node = node.left;
                }
                else{
                    if(st.isEmpty()){
                        break;
                    }
                    node = st.pop();
                    inorder.add(node.data);
                    node = node.right;
                }
            }
            return inorder;

        }
        public List<Integer>  postorder_traversal(Node root){
            Stack<Node> st1 = new Stack<>();
            Stack<Node> st2 = new Stack<>();
            ArrayList<Integer> ans = new ArrayList<>();

            if(root==null){
                return ans;
            }
            st1.push(root);
            while(!st1.isEmpty()){
                root = st1.pop();
                st2.push(root);
                if(root.right!=null){
                    st1.push(root.right);
                }
                if(root.left!=null){
                    st1.push(root.left);
                }
            }
            while(!st2.isEmpty()){
                ans.add(st2.pop().data);
            }
            return ans;
        }

        public static int maxDepth(Node root){
            if(root==null){
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1+Math.max(right,left);
        }

        public static int checkForBalanced(Node root){
            if(root==null){
                return 0;
            }
            int lh = checkForBalanced(root.left);
            int rh = checkForBalanced(root.right);
            if(lh==-1 || rh==-1){
                return -1;
            }
            if(Math.abs(lh-rh)>1){
                return -1;
            }
            return 1+Math.max(lh,rh);
        }
        
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildBinaryTree(nodes);
        System.out.println(tree.postorder_traversal(root));
        // System.out.println(tree.maxDepth(root));
        System.out.println(tree.maxDepth(root));
    }
}
