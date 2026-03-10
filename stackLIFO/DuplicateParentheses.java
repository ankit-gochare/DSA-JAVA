import java.util.Stack;

public class DuplicateParentheses{

    // Duplicate Parentheses
    // given a balanced and valid expression 
    // find if it contains duplicate (EXTRA) parentheses
    // a set of parentheses are duplicate if the same subexpression is surrounded by multiple parenetheses

    // Return a true if it contains duplicate else return false

    // (((a + (b))) + (c+d)) -> true
    // ((((a) + (b))+ c+d)) -> true
    // (((a + b)) + c) -> true
    // ((a +b ) + (c+d)) -> false

    // approach 
    // 1. create a stack
    // 2. if there is any operand , operator or opening bracket 
    // push it into gthe stack 

    // and if there is a closing bracket take a count varibale == 0
    // and pop from the stack till we get tha correct pair for the closing bracket
    
    // if the count < 1 means the closing bracket gets the pair on the peek initially
    // means it is duplicate 

    // and if count >= 1 means no duplicate check further

    public static boolean duplicate(String str){
        // create a stack 
        Stack<Character> s = new Stack<>();

        // check fo each character
        for(int i=0 ; i <str.length() ; i++){
            char ch = str.charAt(i);

            // if closing
            if(ch == ')'){
                // count
                int count = 0;

                // pop from the stack and count++
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }

                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            // opening
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(duplicate("(((a + (b))) + (c+d))"));
        System.out.println(duplicate("((((a) + (b))+ c+d))"));
        System.out.println(duplicate("(((a + b)) + c)"));
        System.out.println(duplicate("((a +b ) + (c+d))"));

        // (((a + (b))) + (c+d)) -> true
        // ((((a) + (b))+ c+d)) -> true
        // (((a + b)) + c) -> true
        // ((a +b ) + (c+d)) -> false
    }
}