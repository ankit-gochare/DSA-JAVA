public class SortedArray{

    // check if a given array is sorted or not 
    // 1,2,3,4,5,6

    // algorithm approach 
    // first we check the 0th and 1st element of the array 
    // if they are not sorted 
    // then return fasle

    // if they are sorted then call check for the 1st and 2nd element and so on 

    // so the recursive function will be 
    // f(arr , i+1)

    // and the base case will be i == arr.length-1
    // return true 

    public static boolean isSortedArr(int[] arr , int i){
        // base condition to stop recursive calls
        if(i == arr.length-1){
            return true;
        }

        // if not sorted 
        if(arr[i]>arr[i+1]){
            return false;
        }

        // if sorted
        return isSortedArr(arr,i+1);
    }
    public static void main(String[] args){
        // we have to pass i =0 int the function call
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5,4};
        System.out.println(isSortedArr(arr1 , 0));
        System.out.println(isSortedArr(arr2 , 0));
    }
}