public class SumNodes{

    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Sum of Node
    // sum of the left subtree
    // sum of the right subtree
    // then for root leftSum + rightSum + root.data

    public static int sum(Node root){
        // base case
        if(root == null){
            return 0;
        }

        // leftSum
        int ls = sum(root.left);

        // rightsum
        int rs = sum(root.right);

        // root 
        return ls + rs + root.data;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(sum(root));
    }
}