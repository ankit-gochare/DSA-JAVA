import java.util.*;
import java.util.LinkedList;

public class Traversals{

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

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;

            // empty node // not existing 
            if(nodes[idx] == -1){
                return null;
            }

            // create a node 
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode; 
        }

        // preOrder traversal
        public static void preOrder(Node root){
            // base case
            if(root == null){
                return ;
            }

            // root 
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // In order traversal
        public static void inOrder(Node root){
            // base case
            if(root == null){
                return;
            }

            // left 
            inOrder(root.left);

            // root
            System.out.print(root.data + " ");

            // right
            inOrder(root.right);
        }


        // Post order traversal
        public static void postOrder(Node root){
            // base case
            if(root == null){
                return;
            }

            // left
            postOrder(root.left);

            // right
            postOrder(root.right);

            // root
            System.out.print(root.data + " ");
        }


        // Level order traversal
        public static void levelOrder(Node root){
            // empty tree
            if(root == null){
                return;
            }

            // create a Queue
            Queue<Node> q = new LinkedList<>();

            // add root node and null in queue
            q.add(root);
            q.add(null);

            // for 
            while(!q.isEmpty()){
                // remove the current Node from queue
                Node currNode = q.remove();

                // if null -> next line
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");

                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        bt.preOrder(root);
        System.out.println();

        bt.inOrder(root);
        System.out.println();

        bt.postOrder(root);
        System.out.println();

        bt.levelOrder(root);
    }
}