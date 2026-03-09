import java.util.Stack;

public class ReverseStack{

    // revrse a stack 

    // Appraoch 1
    // creaete a new stack
    // pop fro the original , push into the new 
    // repeat this till the original stack do not get empty
    
    // time and space complexity is O(n)
    public static Stack reverseStack1(Stack<String> st){
        // craete a new stack 
        Stack<String> stNew = new Stack<>(); 

        while(!st.isEmpty()){
            String curr = st.pop();
            stNew.push(curr);
        }

        return stNew;
    }

    // approach 2 
    // using recursion 
    // to reduca the space complexity to 0(1)
    
    // first empty the stack 
    // then pushAtBottom
    public static void reverseStack2(Stack<String> s){
        // base case if empty return
        if(s.isEmpty()){
            return;
        }

        // pop
        String top = s.pop();

        // reverse stack
        reverseStack2(s);

        // pushAtBottom
        pushAtBottom(s , top);
    }

    public static void pushAtBottom(Stack<String> s , String data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // pop
        String top = s.pop();

        // push at bottom
        pushAtBottom(s,data);

        // push remaining
        s.push(top);
    }

    public static void main(String[] args){
        Stack<String> sc = new Stack<>();
        sc.push("is");
        sc.push("it");
        sc.push("what");
        sc.push("it");
        sc.push("is");
        sc.push("?");


        // System.out.println(sc);
        // Stack reverse = reverseStack1(sc);
        // System.out.println(reverse);

        System.out.println(sc);
        reverseStack2(sc);
        System.out.println(sc);


    }
}