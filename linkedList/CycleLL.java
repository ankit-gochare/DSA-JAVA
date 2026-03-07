public class CycleLL{

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // 1. Detecting a loop / cycle in a linked list
    // if a linked list have a loop 
    // then there is no null

    // for detecting cycle in linked list we use 
    // Floyd's cycle finding algorithm 

    // in this algorithm we use the slow fast approach
    // slow = head 
    // fast = head 
    // slow +1
    // fast +2 

    // we will continue this 
    // while (fast != null && fast.next ! = null)

    // if a linked list have loop then 
    // the slow and fast will meet at a node again
    
    // and if they do not meet means there is no cycle 

    public static boolean isCycle(){
        Node slow = head ;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // chcek if slow and fast meet 
            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; // cycle does not exists 
    }
    // time complexity is O(n)


    // 2. remove a loop / cycle in a linked list

    // approach
    // 1. find the last node 
    // 2. last node.next = null

    // to find the last node 
    // 1. detect cycle 
    // if cycle not exists return 

    // if exist cycle 
    // then slow = head
    // and now move both slow and fast only one place 
    
    // after apoint slow and fast will meet again 
    // and the node at which they mate again is the same node where the 
    // last node.next points 

    // we have to go the last node 
    // take a node prev that will track the last node 
    // and make the last node's next = null

    // this will not work for circular linked list

    public static void removeCycle(){
        // detect cycle 
        Node slow = head ;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // chcek if slow and fast meet 
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        
        if(cycle == false){
            return ;
        }

        // find the next meeting point 
        // node pointed pointed by the last node 
        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle 
        prev.next = null;
    }

    // print the ll
    public void print(){
        Node temp = head ;
        while(temp !=null){
            System.out.print(temp.data + "-> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node (2);
        head.next.next = new Node (3);
        head.next.next.next = head.next; // linked list with normal cycle 
        // head.next.next.next = head; // ll with full cycle (circular ll)
        // head.next.next.next = null; // ll no cycle  

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}