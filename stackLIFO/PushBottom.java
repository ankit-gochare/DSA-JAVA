import java.util.Stack;

public class PushBottom{

    // push at the bottom of the stack

    // first pop all the elements from the stack
    // then push in the required order

    // using recursion here 
    // time complexity O(n)
    public static void pushAtBottom(Stack<Integer> s , int data){
        // if empty just push
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // pop
        int top = s.pop();

        // push at bottom 
        pushAtBottom(s, data);

        // push remaining
        s.push(top);

    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushAtBottom(s, 23);

        System.out.println(s);
    }
}