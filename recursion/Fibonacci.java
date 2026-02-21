public class Fibonacci{
    
    // print the nth fibonacci number 
    // 0   , 1   , 1   , 2   , 3 , 5 , 8 , 13 , 21
    // oth , 1st , 2nd , 3rd ,..............

    // algorithm approach
    // the nth fibonacci term is the sum of n-1th and n-2th fibonacci term 
    // so the recursive function will be
    // f(n) = f(n-1) + f(n-2)

    // we firstv claculate f(n-2)
    // then f(n-1)
    // then add bth to get the nth fibonacci number

    // and the base case will be n==1 || n==0
    // return n

    public static int fibonacciNum(int n ){
        // base case to stop the recursive call
        if(n==0 || n==1){
            return n;
        }
        // otherwise call the function for n-1
        int fnm1 = fibonacciNum(n-1);

        // then call the function for n-2
        int fnm2 = fibonacciNum(n-2);

        // add fnm1 and fnm2 to get nth fibonacci term
        int fn = fnm1 + fnm2;

        return fn;
    }
    // time complexity = 2^n
    // space complexity = O(n)
    
    public static void main(String[] args){
        // fibonacciNum(5);
        System.out.println(fibonacciNum(5));
        System.out.println(fibonacciNum(4));
    }
}