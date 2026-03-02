public class BacktrackingArr{
    // we are given an empty array of size n
    // first we have to insert 1 to n in the array 
    // then we have to subtract 2 from each value in the array

    // eg . for n = 5
    // first 1,2,3,4,5
    // then -1,0,1,2,3

    // because we are using backtracking here so we have to 
    // pass index=0 and value =1 initially
    public static void backtrackArr(int[] arr , int i , int value){
        // base case 
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = value; // work
        backtrackArr(arr , i+1 , value+1); // inner calls 
        arr[i] = arr[i]-2; // backtracking step
    }
    // the time complexity of this algorithm will be O(n)
    // because of n function calls 
    // and also the space complexity O(n)
    // for the same reason

    public static void printArr(int[] arr){
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n=5;
        int arr[] = new int[n];
        backtrackArr(arr , 0 , 1);
        printArr(arr);
    }    
}