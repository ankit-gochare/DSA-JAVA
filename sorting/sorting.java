// sorting means arranging elements in a particular order. 
// types of sorting:
// 1. bubble sort
// 2. selection sort
// 3. insertion sort
// 4. counting sort

// import java.util.*;

public class sorting {

    // 1. bubble sort:
    // large elements come to the end of array by swapping with adjacent elements
    // it is a simple sorting algorithm that repeatedly steps through the list,
    // compares adjacent elements and swaps them if they are in the wrong order.
    // The bubble sort algorithm have a time complexity of O(n^2)

    public static void bubbleSortAsc(int[] arr){
        int n = arr.length;
        // for the array of size n we have to run the outer loop for n-1 times
        // we are starting the loop from 0 therefore break condition will be i<n-1; 
        for (int i =0 ; i<n-1 ;i++){
            // the inner loop will execute for n-1-i times
            for (int j =0;j<n-1-i;j++){
                // if the current element is greater than the next element 
                // swap the elements
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    // bubble sort for descending order
    public static void bubbleSortDesc(int[] arr){
        for(int i =0; i< arr.length-1 ; i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // function to print array
    public static void printArr(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        int[] arr2 = {5,4,1,3,2};

        printArr(arr);

        bubbleSortAsc(arr);

        printArr(arr);

        bubbleSortDesc(arr2);

        printArr(arr2);

    }
}
