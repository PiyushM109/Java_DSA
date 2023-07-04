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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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


    public static Node createBST(int[] arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static void inorderAL(ArrayList<Integer> al ,Node root){
        if(root == null){
            return;
        }
        inorderAL(al, root.left);
        al.add(root.data);
        inorderAL(al, root.right);
    }

    public static Node balansBST(ArrayList<Integer> list, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(list.get(mid));
        root.left = balansBST(list, st, mid-1);
        root.right = balansBST(list, mid+1, end);
        return root;
    }

    public static Node balancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorderAL(list, root);

        return balansBST(list, 0, list.size()-1);
    }


    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }


    public static int maxBST = 0;

    public static Info largestBST(Node root){

        if(root==null){
            return new Info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }


        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        if(root.data<=leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    
    }

    public static void getInorder(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static Node makeIt(ArrayList<Integer> list, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(list.get(mid));

        root.left = makeIt(list, st, mid-1);

        root.right = makeIt(list, mid+1 , end);

        return root;

    }


    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> bst1 = new ArrayList<>();
        ArrayList<Integer> bst2 = new ArrayList<>();
        getInorder(root1, bst1);
        getInorder(root2, bst2);

        //merge both arrayList
        int i=0, j=0;
        ArrayList<Integer> FinalArr = new ArrayList<>();
        while(i<bst1.size() && j<bst2.size()){
                if(bst1.get(i)<=bst2.get(j)){
                    FinalArr.add(bst1.get(i));
                    i++;
                }
                else{
                    FinalArr.add(bst2.get(j));
                    j++;
                }
        }

        while(i<bst1.size()){
            FinalArr.add(bst1.get(i));
            i++;
        }

        while(j<bst2.size()){
            FinalArr.add(bst2.get(j));
             j++;
        }

        return makeIt(FinalArr, 0, FinalArr.size()-1);
    }


    public static void main(String[] args) {
        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);

        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);
        
        // root = balancedBST(root);
        // preorder(root);

        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        // Info info = largestBST(root);
        // System.out.println("Largest BST size = " + maxBST);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node temp = mergeBST(root1, root2);
        preorder(temp);

    }
}