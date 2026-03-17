// public class Subtree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Subtree of another tree
//     // given the roots of 2 binary trees root and subRoot
//     // return true if there is a subtree of root with the same structure and value
//     // of subroot
//     // and false Otherwise

//     // approach
//     // 1. find the node matches with the subRoot
//     // 2. then check if leftSubtree is identical and right Subtree is identical

//     // we check for non identical
//     // Non identical
//     // 1. diffrent data
//     // 2. node null
//     // 3. leftsubtree non identical
//     // 4. right subtree non identical

//     public static boolean isIdentical(Node node, Node subRoot) {
//         // both null true
//         // base case
//         if (node == null && subRoot == null) {
//             return true;
//         }
//         // 1. diffrent data
//         // 2. node null
//         else if (node == null || subRoot == null || node.data != subRoot.data) {
//             return false;
//         }

//         // 3. leftsubtree non identical
//         if (!isIdentical(node.left, subRoot.left)) {
//             return false;
//         }

//         // 4. right subtree non identical
//         if (!isIdentical(node.right, subRoot.right)) {
//             return false;
//         }

//         // identical
//         return true;

//     }

//     public static boolean isSubtree(Node root, Node subRoot) {
//         // base case

//         if (subRoot == null) {
//             return true;
//         }
//         if (root == null) {
//             return false;
//         }

//         // 1. find the node matches with the subRoot
//         if (root.data == subRoot.data) {
//             // 2. then check if leftSubtree is identical and right Subtree is identical
//             if (isIdentical(root, subRoot)) {
//                 return true;
//             }
//         }

//         // if left subtree is subtree or is rigthsubtree is subtree
//         return isSubtree(root.left, subRoot.left) || isSubtree(root.right, subRoot.right);
//     }

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.right = new Node(6);

//         Node subRoot = new Node(2);
//         subRoot.left = new Node(4);
//         subRoot.right = new Node(5);

//         Node subRoot1 = new Node(2);
//         subRoot1.left = new Node(4);
//         subRoot1.left.left = new Node(6);
//         subRoot1.right = new Node(5);

//         System.out.println(isSubtree(root, subRoot));
//         System.out.println(isSubtree(root, subRoot1));
//     }
// }



public class Subtree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Subtree of another tree
    // given the roots of 2 binary trees root and subRoot
    // return true if there is a subtree of root with the same structure and value
    // of subroot
    // and false Otherwise

    // approach
    // 1. find the node matches with the subRoot
    // 2. then check if leftSubtree is identical and right Subtree is identical

    // we check for non identical
    // Non identical
    // 1. diffrent data
    // 2. node null
    // 3. leftsubtree non identical
    // 4. right subtree non identical

    public static boolean isIdentical(Node node, Node subRoot) {
        // both null true
        // base case
        if (node == null && subRoot == null) {
            return true;
        }
        // 1. diffrent data
        // 2. node null
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        // 3. leftsubtree non identical
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        // 4. right subtree non identical
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        // identical
        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        // base case

        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        // 1. find the node matches with the subRoot
        if (root.data == subRoot.data) {
            // 2. then check if leftSubtree is identical and right Subtree is identical
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // if left subtree is subtree or is rigthsubtree is subtree
        // ✅ FIX: always pass full subRoot
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        Node subRoot1 = new Node(2);
        subRoot1.left = new Node(4);
        subRoot1.left.left = new Node(6);
        subRoot1.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
        System.out.println(isSubtree(root, subRoot1));
    }
}