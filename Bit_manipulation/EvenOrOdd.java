

public class EvenOrOdd {

    // check if a number is odd or even 
    // if lsb of a binary is 1 == odd
    // if the lsb of a binary number is 0 == even

    // approach
    // we have to select a bitmask such that
    // it contains 1 at lsb 
    // and 0 at all other bits 
    // so the bitmask will be 1 itself

    // then we will perform bitwise and (&)
    // between the binary number and the bitmask
    // and if the answer == 0 means even number
    // else it is an odd number

    public static void oddOrEven(int num){
        int bitmask =1;

        if((num & bitmask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        oddOrEven(3);
        oddOrEven(4);
    }
}
