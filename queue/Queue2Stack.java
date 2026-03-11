import java.util.Stack;

public class Queue2Stack{

    // Queue implementation using 2 stacks
    // when add in O(n)

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add O(n)
        public static void add(int data){
            // push all the element of s1 in s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            // then push the current data in s1 
            s1.push(data);

            // then push all element of s2 in s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // remove() O(1)
        public static int remove(){
            // if empty
            if(isEmpty()){
                System.out.println("The Queue is mepty");
                return -1;
            }
            return s1.pop();
        }

        // peek()
        public static int peek(){
            // if empty 
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1 ;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}