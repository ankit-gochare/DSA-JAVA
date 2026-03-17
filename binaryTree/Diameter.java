public class Diameter {

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

    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }

        // left height 
        int lh = height(root.left);

        // right height
        int rh = height(root.right);

        // height 
        return Math.max(lh , rh) + 1;
    }

    // Diameter of a tree
    // No. of node s in the longest path between two leafNodes

    // Node root = new Node(1);
    // root.left = new Node(2);
    // root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.left.right = new Node(5);
    // root.right.right = new Node(6);
    // diameter = 5

    // when calculating diameter we have two case
    // 1. diameter passes throght hte root node
    // 2. diameter doesn't pass through the root node
    
    // Approach 1
    // 1. diameter passes throght hte root node
    // Rootdiameter = leftHeight + rightHeight + 1
    
    // 2. diameter doesn't pass through the root node
    // then diameter will be in left subtree or in right subtree

    // final diameter = max(leftDia , right Dia , root Dia)

    public static int diameter(Node root){
        // base case
        if(root == null){
            return 0;
        }

        // left Diameter
        int ld = diameter(root.left);

        // left height
        int lh = height(root.left);

        // right diameter
        int rd = diameter(root.right);

        // right height
        int rh = height(root.right);

        // diameter thriugh root
        int selfD = lh + rh + 1;

        return Math.max(selfD , Math.max(ld , rd));
    }
    // time complexity O(n^2)
    // because we are calculating height for all n nodes and 
    // 1 time height calculation needs n time 


    // Approach2  O(n)
    // to reduce time complexity we will now calculate bith diameter and height in the same function
    // by using a info class which contains diameter and height

    static class Info{
        int ht ;
        int dia;

        Info(int ht , int dia){
            this.ht = ht ;
            this.dia = dia;
        }
    }

    public static Info diameter2(Node root){
        // base case
        if(root == null){
            return new Info(0,0);
        }

        // left height and diameter
        Info li = diameter2(root.left);

        // right height and diameter
        Info ri = diameter2(root.right);

        // diameter 
        int dm = Math.max(Math.max(li.dia , ri.dia), li.ht + ri.ht + 1 );

        // height 
        int ht = Math.max(li.ht , ri.ht) + 1;

        return new Info(ht , dm);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // System.out.println(diameter(root));

        System.out.println(diameter2(root).dia);
        System.out.println(diameter2(root).ht);
    }
}