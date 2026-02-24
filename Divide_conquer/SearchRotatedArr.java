public class SearchRotatedArr{

    // Search in a Rotated Sorted Array
    // input sorted array with distinct numbers in ascending order 
    // It is rotated at a pivot point. Find the index of given element
    // 4,5,6,7,0,1,2
    // target = 0 , answer = 4

    // approach 
    // if we apply linearsearch then we get the time complexity = O(n)
    // but wkt binary search give O(logn) time complexity 
    // and here the array is also sorted so we can apply modified binary search 
    // that too with recursion 

    // to solve this problem first we analyze it using a graph
    // plot two lines l1 and l2 
    // in such a way that the starting elements till the pivot are on the line l1
    // and the elements after the pivot are on line l2

    // now start =0; 
    // end = arr.length-1;
    // calculate mid = (start + end) /2

    // if arr[mid] == target return mid ;

    // now we have two cases
    // the mid we calculate can lie on the line l1 or the line l2

    // 1. when mid lies on the line l1 
    // compare arr[mid] with target 
    // if arr[start]<=target <= arr[mid]
    // the the target will in the left
    // else the target will be in the right of the mid (it can be on either l1 or l2 )

    // 2. when mid lies on the line l2
    // compare arr[mid] with target
    // if arr[mid+1]<= target <= arr[end]
    // then the target is present on the right
    // else the target is present in the left of the mid ( it can be on either l1 or l2)

    // and when did the mid lie on the l1 and l2
    // the mid will lie on l1 when 
    // arr[start]<=arr[mid]

    // the mid will lie on l2 when 
    // arr[mid]<=arr[end]

    // base case is when start>end , return -1 not found

    // internal call 
    // left search(arr, target , start , mid-1)
    // right search(arr , target , mid+1 , end)

    public static int search(int[] arr , int target , int start , int end){
        // base case
        if(start>end){
            return -1;
        }
        // to do 
        // calculate mid
        int mid = start + (end -start)/2;

        // if target is on mid
        if(arr[mid] == target){
            return mid;
        }

        // case 1 
        // mid on l1
        if(arr[start]<=arr[mid]){
            // case a left
            if(arr[start]  <= target && target <= arr[mid]){
                return search(arr ,target , start , mid-1);
            }
            else{
                // case b right
                return search(arr ,target , mid+1 , end);
            }
        }

        // mid on l2
        else{
            // case c left
            if(arr[mid] <=target && target <= arr[end]){
                return search(arr , target , mid+1 , end);
            }
            else{
                // case 4 right
                return search(arr , target , start , mid-1);
            }
        }
    }



    public static void main(String[] args){
        int [] arr = {4,5,6,7,0,1,2};
        int ans1 =search(arr , 0 , 0 , arr.length-1);
        int ans2 =search(arr , 6 , 0 , arr.length-1);
        int ans3 =search(arr , 4 , 0 , arr.length-1);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}