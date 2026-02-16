

public class ReverseArray {

    public static void reverseArr(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
    }

    // function to print array
    public static void printArr(int[] arr){
        int start =0;
        int end = arr.length-1;

        for(int i =start ; i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        printArr(arr);

        reverseArr(arr);
        printArr(arr);


    }
}
