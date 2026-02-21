public class PrintNumbers{

    // 1. print numbers from n to 1 in decreasing order
    // eg. 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1

    // algorithm approach
    // here we know that we have to start from n 
    // so in first step we print n and 
    // then we have print n-1 numbers
    
    // so the recursive function will be 
    // f(n) = n + f(n-1)

    // and the base case is when n==1 
    // we have to print 1 and then return

    public static void printDec(int n){
        // base condition to stop recursion
        if(n==1){
            System.out.println(n);
            return;
        }

        // otherwise print n 
        System.out.print(n + " ");

        // then call the function for n-1
        printDec(n-1);
    }

    // 2. print numbers from 1 to n in increasing order
    // eg. 1,2,3,4,5,6,7,8,9,10

    // algorithm approach
    // here we have to start printing from 1 
    // then at last we have to print n

    // so we first print n-1 numbers by calling function recursively for n-1 
    // then we will print n

    // so the recursive function will be 
    // f(n) = f(n-1) + n

    // and the base case will be n==1
    // print n and return 

    public static void printInc(int n){
        // base condition 
        if(n==1){
            System.out.print(n + " ");
            return;
        }

        // otherwise call function for n-1
        printInc(n-1);

        // then print n 
        System.out.print(n + " ");
    }

    public static void main(String[] args){

        System.out.println("Decreasing order");
        printDec(10);

        System.out.println("Increasing order");
        printInc(10);
    }
}