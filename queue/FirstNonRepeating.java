import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeating{

    // Firt non repeating letter in a stream of lowercase Characters
    // aabccxb
    // a -1 b b b b x

    // approach
    
    // 1. take freq array of size 26
    // it will track the no.of time the characters present in the string

    // 2. take a queue 

    // for each charcter in the string 
    // add charcter in the queue
    // increse the ferequency 
    // freq(ch-'a')++

    // chcek if the front element's frequency is 1 or more
    // if 1 thi sthe require repeating element 
    // else remove the current front and chcek for the next
    // print first repeating element

    // if no element left in the queue then print -1

    public static void nonRepeating(String str){
        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>(); 

        // for each character
        for(int i= 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            // add charcter in the queue
            q.add(ch);

            // increse the ferequency 
            freq[ch - 'a']++;

            // chcek if the front element's frequency is 1 or more
            while(!q.isEmpty() && freq[q.peek() - 'a'] >1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }
            else{
                System.out.print(q.peek() + " ");
            }
            
        }
        System.out.println();

    }

    public static void main(String[] args){
        String str = "aabccxb";
        nonRepeating(str);
    }


}