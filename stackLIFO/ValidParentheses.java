import java.util.Stack;

public class ValidParentheses{

    // Valid Parentheses
    // given a string str containing just the characters ( , ) , { , } , [ , ]
    // determine if the input string is valid 

    // An input string is valid if 
    // 1. open brackets must be closed by the same type of brackets
    // 2. open brackets must be close in the correct order
    // 3. every close bracket has a corresponding open bracket of gthe same type 

    // ()[]{} -> true
    // () -> true
    // ({[]}()) -> true

    // (] -> false
    // )( -> false

    // there are many ways to solve this problem but we will solve this using stack 
    // time complexity O(n)

    // 1. create a stack
    // 2. from string start from the first character 
    // if the character is a open bracket then push it into the stack 

    // and if it is a closing bracket 
    // then check if the top of stack is correct pair for this closing bracket
    // if yes then pop the peek 
    // check for the other charcaters
    // if not a pair then false not valid

    // 3. in the end when all the brackets are checked then 
    // check if the stack is empty or not 
    // if empty true valid
    // if not empty false invalid

    public static boolean valid(String str){
        // create a stack
        Stack<Character> s = new Stack<>();

        //check for each character
        for(int i = 0 ; i< str.length() ; i++){

            char ch = str.charAt(i);

            // opening brackets then push
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }
            // closing 
            else{
                // if stack empty return false
                if(s.isEmpty()){
                    return false;
                }

                // chcek for the correct pair
                if((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        // when the string is traversed completely
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }


    public static void main(String[] args){
        System.out.println(valid("(){}[]")); // true
        System.out.println(valid("()")); // true
        System.out.println(valid("(){}]")); // false
    }

}