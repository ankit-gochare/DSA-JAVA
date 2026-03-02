public class MaxSubArrSum{

    // we have to find the maximum prefix sum 
    public static void kadane(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<arr.length;i++){
            curSum+=arr[i];
            if(curSum <0){
                curSum=0;
            }
            maxSum=Math.max(curSum , maxSum);
        }
        System.out.println(maxSum);
    }

    public static void kadane2(int[] arr) {
        int maxSum = arr[0];     // initialize with first element
        int curSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // either start new subarray OR extend previous one
            curSum = Math.max(arr[i], curSum + arr[i]);

            // update maxSum
            maxSum = Math.max(maxSum, curSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
    public static void main(String[] args){
        int[] arr ={1,-2,6,-1,3};
        kadane(arr);
        kadane2(arr);
    }
}