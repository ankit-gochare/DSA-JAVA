
public class OrderAgnosticBinarySearch {

    public static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        // ascending or descending order
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            // same for both ascending and descending order
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                // target < middle element , move left
                if(target < arr[mid]){
                    end = mid-1;
                }
                // target > middle element , move right 
                else{
                    start = mid+1;
                }
            }
            else{
                // target < middle element , move right
                if(target < arr[mid]){
                    start = mid+1;
                }
                // target > middle element , move left 
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int search1 = orderAgnosticBS(arr1, 8);

        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        int search2 = orderAgnosticBS(arr2, 8);
        System.out.println(search1);
        System.out.println(search2);
    }
}
