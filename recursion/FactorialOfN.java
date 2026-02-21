public class FactorialOfN{

    // print the factorial of a given number n 
    // 5! = 120 
    // 4! = 24

    // algorithm approach
    // the factorial of 5 is 120 
    // which is 5*4*3*2*1

    // and the factorial of 4 is 25
    // which is 4*3*2*1

    // from this 2 we got that 
    // the factorial of a number is the number * factorial of the number-1

    // so the recursive function for factorial 
    // f(n) = n * f(n-1)

    // here we have multiply the result of f(n-1) to n
    // so we first store the result of f(n-1)
    // then multiply it with n

    // the base condition will be n==0
    // 0! == 1 
    // so return 1 


    public static int factorial(int n ){
        // base condition to stop recursive calls
        if(n==0){
            return 1;
        }

        // otherwise call function for n-1 and store the value
        int fnm1 = factorial(n-1);

        // now multiply n to f(n-1)
        int fn = n*fnm1;

        return fn;
    }
    // time complexity = O(n)
    // space complexity = O(n)

    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(4));

    }
}