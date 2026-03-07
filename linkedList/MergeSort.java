// import java.util.LinkedList;

public class MergeSort{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;



    // Merge sort on linked list

    // 1. find the midnode of the lonked list
    // 2. Divide the linked list
    // 3. MergeSort(lefthalf)
    //    MergeSort(rightHalf)
    // 4. Merge


    // 1. to find the mid use slow fast approach
    // and remember that we want left half's last node as the mid 
    // so we initialize slow = head 
    // but fast = head.next
    
    // 2. Divide in left and right half
    // rightHead = mid.next
    // mid.next = null 

    // 3. MergeSort(head)
    //    MergeSort(rightHead)

    // 4. Merge
    // use a temperary linked list to merge
    // create a dummy node temp in the temporary list with value -1
    // compare left head data and right head data
    // which one is smaller insert in the temporary list
    // it means let the temporary list's temp .next = the smaller value
    // update the head and the temp 

    // base case if empty or only one node 
    // already sorted 

    public static Node mergeSort(Node head){
        // Base case
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // Divide in left half and right half 
        Node rightHead = mid.next;
        mid.next = null;

        // MergeSort call
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft , newRight);
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp  = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // if only 1st half have elements
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // if only 2nd half have elements
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        print();

        head = mergeSort(head);

        print();


    }
}