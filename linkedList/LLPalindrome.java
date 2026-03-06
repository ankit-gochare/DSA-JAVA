public class LLPalindrome{

    // Palindrom LinkedList
    // chcek if a linkedlist is a palindrome or not
    // 1 -> 2 -> 2 -> 1 -> null  // true
    // 1 -> 2 -> 3 -> 1 -> null  // false

    // approach 1
    // store the linked list data into an array or string 
    // then check if the array or string is a palindrome or not 
    // the time complexity of this will be O(n)
    // and also the space complexity will be O(n)

    // approach 2
    // with O(n) time 
    // but O(1) space 

    // 1. find the midnode (using slow fast concept)
    // 2. reverse the 2nd (right half) of the linked list
    // 3. check if 1st half == 2nd half

    // 1. midnode
    // take 2 pointers 
    // slow = head
    // fast = head
    // but each time increase slow by 1
    // and fast by 2

    // so when the fast == null or fast.next==null
    // then slow will be at the midnode
    public static LinkedList.Node findMid(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // 2. 2nd half reverse 
    // 3 variable 
    // prev = null 
    // curr = midNode
    // next

    // 4 steps
    // while(curr!=null)
    // next = curr.next
    // curr.next = prev
    // prev = curr
    // curr = next 

    public static boolean checkPalindrome(LinkedList ll){
        // empty or size = 1 list
        // alawys palindrome
        if(LinkedList.head == null || LinkedList.head.next==null){
            return true;
        }

        // step 1 - findmid
        LinkedList.Node midNode = findMid(LinkedList.head);

        // step -2 : reverse 2nd half 
        LinkedList.Node prev = null;
        LinkedList.Node curr = midNode;
        LinkedList.Node next ;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step-3 : check left half == right half
        LinkedList.Node right = prev;  // right half head
        LinkedList.Node left = LinkedList.head; // left half head

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }



    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.add(0,1);
        ll.add(1,2);
        ll.add(2,2);
        ll.add(3,1);

        ll.printList();

        System.out.println(checkPalindrome(ll));
    }
}