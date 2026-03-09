public class StackLl{

    // Stack implementation using Linked list

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        // check if the stack is empty
        public static boolean isEmpty(){
            return head == null;
        }

        // push - add to first
        public static void push(int data){

            // create a new node 
            Node newNode = new Node(data);

            // if the stack is empty
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop - removeFirst.
        public static int pop(){
            // if stack empty return -1;
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(6);

        // print and delete
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();

    }
}