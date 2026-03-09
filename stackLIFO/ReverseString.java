import java.util.Stack;
public class ReverseString{

    // Reverse a String using string 

    // push all elements in the stack
    // take a stringBuilder

    // pop element form the stack 
    // and add into the string builder 

    //  we get the reverse String

    public static String reverseString(String str){
        // create an stack
        Stack<Character> sc = new Stack<>();

        // push into the stack
        int i = 0;
        while(i< str.length()){
            sc.push(str.charAt(i));
            i++;
        }

        // create a stringBuilder
        StringBuilder sb = new StringBuilder("");

        // pop from stack and add in string builder
        while(!sc.isEmpty()){
            char curr = sc.pop();
            sb.append(curr);
        }

        // return sb as a string
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "abc";
        String reverse = reverseString(str);
        System.out.println(reverse);
    }
}