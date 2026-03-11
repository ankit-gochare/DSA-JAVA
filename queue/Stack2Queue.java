import java.util.LinkedList;
import java.util.Queue;

public class Stack2Queue{

    // Stack implementation using 2 Queue
    // when pop() and peek() in O(n)
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public static void push(int data){
            // add to non empty queue
            // first choice will be q1
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        // pop() O(n)
        public static int pop(){
            // if empty
            if(isEmpty()){
                System.out.println("The stack is empty");
                return -1;
            }

            int top = -1;

            // case 1 q1  has elements
            if(!q1.isEmpty()){
                // add all q1 elements in q2 except the last to be deleted
                while(!q1.isEmpty()){
                top = q1.remove();

                // if q1 gets empty then remove this element only 
                // don't add to q2
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);

                }
            }
            // case 2 if q2 has elements
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }

                    q1.add(top);
                }
            }

            return top;
        }

        // peek()
        public static int peek(){
            // if empty
            if(isEmpty()){
                System.out.println("The stack is empty");
                return -1;
            }

            int top = -1;

            // case 1 q1  has elements
            if(!q1.isEmpty()){
                // add all q1 elements in q2 except the last to be deleted
                while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);

                }
            }
            // case 2 if q2 has elements
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }



    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}