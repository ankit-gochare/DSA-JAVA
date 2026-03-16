public class CountNodes{

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

    // Count of Nodes 
    // count the left subtree node 
    // count the right subtree node 
    // and for the root it will be leftCount + rightCount +1

    public static int nodes(Node root){
        // base case
        if(root == null){
            return 0;
        }

        // left Count
        int lc = nodes(root.left);

        // right count
        int rc = nodes(root.right);

        return lc + rc + 1;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(nodes(root));
    } 
}