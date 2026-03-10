import java.util.Stack;

public class NextGreaterLeft{

    // Next Greater element
    // The next greater element of some element x in an array is the first greater element 
    // that is to the right of x in the same array

    // if there is no next greater for some element then -1 is for it
    // arr = [6,8,0,1,2]
    // next greater = -1 -1 8 8 8 

    // Approach 1 
    // Brute force approach

    // bt using nested loops 
    // check for all the elements one by one 
    // time complexity O(n^2)

    // Approach2 
    // using stack 

    // create an stack 
    // create a nextG array of the same length as the input array
    // to store the next greater element on the corresponding index for the elements in original array

    // because we have to check next greater in the left side only
    // so we will go from start to the end of the array
    // so before reaching any element we had analyzed all elements in the right of it 

    // 1. insert all the elements in the stack
    // 2. whenever peek element <= current number
    // pop the lements from the stack till we get the greater number or the stack becomes empty

    // 3. if the stack becomes empty 
    // store -1 
    // if there are some elements 
    // then store stack.peek() as the nextGreater ofr the current number

    // 4. push the elemnt in the stack for which we have checked the nextGreater now 

    // time complexity will be O(n)
    // because all the elements are pushed and popped one one time 
    // so total 2n 
    // and n times the loop 
    // 3n = O(n)

    // remenber we are  storing index in the stack not actual numbers
    public static int[] nextGreater(int [] arr){
        // create an stack 
        Stack<Integer> s = new Stack<>();

        // create an array 
        int[] nextG = new int[arr.length];

        // reverse loop from end to start
        for(int i = 0 ; i< arr.length ; i++){

            int curr = arr[i];

            // pop elements till we get greater or stack empty
            while(!s.isEmpty() && arr[s.peek()] <= curr){
                s.pop();
            }

            // if stack empty store -1
            if(s.isEmpty()){
                nextG[i] = -1;
            }
            // else store peek element
            else{
                nextG[i] = arr[s.peek()];
            }

            // push current index in stack
            s.push(i); 
        }
        return nextG;

    }

    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};

        int[] ans = nextGreater(arr);

        for(int i = 0 ; i <ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }
}