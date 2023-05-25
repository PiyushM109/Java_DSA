import java.util.*;

public class binary_s_tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node deleteNode(Node root, int key){
        if(root.data<key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.data>key){
            root.left = deleteNode(root.left, key);
        }
        else{
            if(root.right==null && root.left==null){
                return null;
            }

            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            Node IS = inOrderSuccesor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }
        return root;
    }
    public static Node inOrderSuccesor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.right, k1, k2);
        }
        else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void root2Leaf(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }

        list.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println(list);
        }

        root2Leaf(root.left, list);
        root2Leaf(root.right, list);

        list.remove(list.size()-1);
    }

    public static boolean isValidBst(Node root, Node min, Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }

    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftmirror = Mirror(root.left);
        Node rightmirror = Mirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;

        return root;
    }



    public static void main(String[] args) {
        int[] nums = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<nums.length; i++){
            root = insert(root, nums[i]);
        }
        inorder(root);
        System.out.println();
        inorder(Mirror(root));
        

        // if(isValidBst(root, null, null)){
        //     System.out.println("Valid");
        // }
        // else{
        //     System.out.println("Not Valid");
        // }

        // printInRange(root, 5, 12);
    }
}