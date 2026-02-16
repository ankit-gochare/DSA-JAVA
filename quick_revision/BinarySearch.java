public class BinarySearch{

    public static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        // this condition is not needed at all
        // if(end == 0){
        //     return -1;
        // }

        while(start<=end){
            int mid = start + (end-start)/2;

            // target == middle elemnet
            if(target == arr[mid]){
                return mid;
            } 

            // target < middle element move left
            else if(target < arr[mid]){
                end = mid-1;
            }
            // target > middle elemnt move right
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int search = BinarySearch(arr, 8);
        System.out.println(search);

    }
}