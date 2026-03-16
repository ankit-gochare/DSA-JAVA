public class Height{

    static class Node{
        int data;
        Node left;
        Node right; 

        Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Height of a binary tree
    // height = max distance from root to leafNode

    // we are calculating height based on nodes 
    // height based on edges = height based on nodes - 1
    
    // in most of the questions of bonary or binary search tree
    // recursion is used
    
    // first calculate the height of left subtree 
    // then for right subtree 
    // then for root it will be maximum of leftheight and rightHeight + 1
    
    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }
        // left Height
        int lh = height(root.left);

        // right height
        int rh = height(root.right);

        // root
        return Math.max(lh , rh)+1;
    }
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(height(root));
    }
}