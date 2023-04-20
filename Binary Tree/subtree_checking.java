public class subtree_checking {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }


    }
    public static boolean isIdentical(Node node, Node subroot){
        if(node==null && subroot==null){
            return true;
        }
        else if(node==null || subroot==null || node.data != subroot.data ){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);
        return leftAns || rightAns;
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
    
        System.out.println(isSubtree(root, subRoot));
    }
    
}
