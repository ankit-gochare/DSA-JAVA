import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class QueueReversal{

    // Queue Reversal 
    // 1 2 3 4 5
    // 5 4 3 2 1

    // use a stack 
    // first push all the lements one by one in the stack
    // then from stack pop and add all the lements one by one in the queue

    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);


        // print
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();


        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        reverseQ(q);

        // print
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}