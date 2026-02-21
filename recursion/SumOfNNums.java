public class SumOfNNums{

    // find the sum of first n natural numbers 
    
    // algorithm approach
    // the sum of fisrt 5 numbers 
    // 1+2+3+4+5 = 15

    // and the sum of first 4 numbers
    // 1+2+3+4 = 10

    // we have to add n to the sum of n-1 numbers
    // so the recursive function will be 
    // f(n) = n + f(n-1)

    // so we have to call function for n-1 and 
    // store the value 
    // then add it to n 

    // and the base condition will be n==1
    // return 1

    public static int sumOfN(int n ){
        //base condition to stop recursive call
        if(n==1){
            return 1;
        }
        // otherwise call function for n-1
        int snm1 = sumOfN(n-1);

        // then add n 
        int sn = n + snm1;

        return sn;
    }
    // time complexity = O(n)
    // space complexity = O(n)

    // so the 
    public static void main(String[] args){
        System.out.println(sumOfN(5));
        System.out.println(sumOfN(4));
    }
}