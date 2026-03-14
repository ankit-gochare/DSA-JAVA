import java.util.*;

public class MinAbsDiffPairs{

    // Minimum Absolute Differebce sum Pairs
    // given 2 arrays A and b of equal length n
    // pair each element of array A to an element in array B ,
    // such that the sum of abslute diffrence rof all the pairs is minimum

    // A = {1,2,3};
    // B = {2,1,3}; 
    // ans = 0 
    
    // approach
    // the more the 2 numbers are close to each other the minimum will be the absolute sum

    // so we pair up the numbers that are close to each other 
    // this the locale greedy

    // but taking in consideration the final global best solution
    // we will sort both tha fraarays a and b 
    // then pair up the smallest with smallest 
    // and largest with the largest

    // we are only pairing one combination 
    // instead of taking each possible combination

    public static void minimumSum(int[] A , int[] B ){
        // sort bith A and B
        Arrays.sort(A);
        Arrays.sort(B);

        // find the diff
        int minDiff = 0;

        for(int i = 0 ; i< A.length ; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println(minDiff);
    }

    public static void main(String[] args){
        int[] A = {1,2,3};
        int[] B = {2,1,3}; 
        minimumSum(A, B);

        int[] A1 = {4,1,8,7};
        int[] B1 = {2,3,5,6}; 
        minimumSum(A1, B1);


    }
}