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

    public void printList(){

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


    // 1. remove from first place
    public int removeFirst(){
        // empty list or size ==1
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null ;
            size =0;
            return val;
        }

        // otherwise 
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    // time complexity O(1)

    // 2. remove last
    public int removeLast(){
        // empty ll or size =1
        if(size ==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 0){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // other wise 
        // find previous of tail
        Node prev = head;
        for(int i =0 ; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // time complexity is O(n)

    // search (iterative)
    // search for a key in a linked list
    // return the position where it is found
    // if not found , return -1

    public int iterativeSearch(int key){
        Node temp = head;

        int i =0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // not found
    }
    // time complexity O(n)


    // Search recursive
    // search for a key in linked list
    // return the position where it is found
    // if not found -1 
    // use recursion

    // first find for head.next 
    // for head it will be calculated automatically

    // base case
    // head.data == key return 0
    
    // amd after the call index = index +1

    public int recursiveSearch(int key){
        return helper(head , key);
    }

    public int helper(Node head , int key){
        // empty list // base case
        if(head == null){
            return -1;
        }

        // found basecase
        if(head.data == key){
            return 0;
        }

        int index = helper(head.next , key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    // time complexity = O(N)
    // space complexity = O(n)


    // reverse a linked list

    // iterative approach
    // 3 variable & 4 steps
    
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next;
        }
        // update the head
        head = prev ;
    }
    // time complexity O(n)

    // Find and remove nth node from the end
    // iterative approach
    // prev.next = next

    // main task is finding the nth node from the end
    // the nth node from the end is 
    // size - n +1 th node from the start
    // to remove nth 
    // we have find prev of it
    public void deleteNthFromEnd(int n ){
        // calculate size 
        int sz = 0;
        Node temp = head ;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n==size){
            head = head.next; // removefirst
            size--;
            return;
        }

        // sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
        return;
    }
    // time complexity = O(n)


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

        ll.printList();
        System.out.println(size);

        ll.add(3,30);
        ll.printList();
        System.out.println(size);
        ll.add(3,23);
        ll.printList();
        System.out.println(size);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();

        System.out.println(ll.iterativeSearch(23));
        System.out.println(ll.iterativeSearch(35));
        System.out.println(ll.recursiveSearch(23));
        System.out.println(ll.recursiveSearch(35));

        ll.reverseLL();
        ll.printList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addFirst(99);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.printList();
        
        ll.deleteNthFromEnd(2);
        ll.printList();
        ll.deleteNthFromEnd(3);

        ll.printList();
    }
}