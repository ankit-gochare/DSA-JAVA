public class QueueLL{

    // Queue implementation using Linked list
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        // is empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // add 
        public static void add(int data ){
            // create a new Node
            Node newNode = new Node(data);

            // if emprty
            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove(){
            // if empty
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }

            int front = head.data;

            // if last element
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }

            return front;
        }

        // peek()
        public static int peek(){
            // if empty
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}