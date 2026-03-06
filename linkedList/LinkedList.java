public class LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // to calculate size along with insertion
    public static int size = 0;

    // 1. Add at the first place 
    // to add a element at the first index 
    // head
    // 1. create a new node
    // 2. newNode.next = head
    // 3. head = newNode

    // corner case is when the linked list is empty
    // 1. head = tail = newNode
    public void addFirst(int data){
        // step-1 : create new node
        Node newNode = new Node(data);
        // to calculate size along with insertion
        size++;

        // empty list
        if(head == null){
            head = tail = newNode;
            return;
        }

        // setep-2 : make head , newNode's next
        newNode.next = head;

        // step-3 : update the head
        head = newNode;
    }
    // time complexity = O(1);

    // 2. Add at the last 
    // 1. create the node
    // 2. tail.next = newNode
    // 3. tail = newNode

    // corner case 
    // when the linked list is empty
    // 2. head = tail = newNode.

    public void addLast(int data){
        // step1 : create a new node
        Node newNode = new Node(data);

        // to calculate size along with insertion
        size++;

        // if empty list
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 : 
        tail.next = newNode;

        // step3 
        tail = newNode;
    }
    // time complexity O(1)

    // 3. add at any index (middle)
    // add(index , data)
    public void add (int index , int data){
        // create a new node
        Node newNode = new Node(data);

        // to calculate size along with insertion
        size++;
        
        // empty list
        if(head == null){
            addFirst(data);
            return;
        }

        // otherwise 
        // find the index prev
        Node temp = head;

        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        } 


        // i = index-1 , temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // time complexity O(n)


    // printing the LinkedList
    // if list is empty
    // print ll is empty

    // otherwise
    // 1. Node temp = head
    // 2. print temp.data
    // 3. temp = temp.next
    // repeat this 3 steps till temp!=null

    public static void printList(LinkedList ll){

        // emty Linked List
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        // step-1 : temporary node
        Node temp = head;

        while(temp!=null){
            // step 2 print
            System.out.print(temp.data + " -> ");

            // step 3 update temp
            temp = temp.next;
        }
        System.out.println("null");
    }
    // time complexity O(n)
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // System.out.println(ll.head.data);
        // System.out.println(ll.head.next.data);

        ll.addFirst(3);
        ll.addFirst(4);

        System.out.println(ll.head.data);
        System.out.println(ll.head.next.data);

        ll.addLast(5);
        System.out.println(ll.tail.data);
        ll.addLast(6);
        System.out.println(ll.tail.data);

        printList(ll);
        System.out.println(size);

        ll.add(3,30);
        printList(ll);
        System.out.println(size);
        ll.add(3,23);
        printList(ll);
        System.out.println(size);
        
    }
}