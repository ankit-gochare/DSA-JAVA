public class MergeSort{

    // Merge Sort

    // Approach 
    // 1. Divide the array in 2 parts at each level 
    // untill we are left with single single elements 
    // base case = single element
    // to divide find the mid = start + (end - start)/2;

    // 2. Apply merge sort recursively 
    // for bith left and right side
    // mergeSort(left)
    // mergeSort(right)

    // 3. merge
    // merge the silutions from left and right side to get the final result
    // to merge we use a temporary array of length (elements in left + elements in right +1)
    // then copy the elements from the temporary array to the original array 


    // Merging
    // take 3 iterators i j and k 
    // i will track the elements of left side
    // j will track the elements of right side 
    // k will point to the temp array index

    // then compare the elements of left and right side 
    // whichever element is less insert it nto the temp array
    // the side from which we have inserted the element 
    // increase the iterator by 1 
    // also increase the iterator of the temp array

    // final after merging copy value in original array repeat this recursively

    // Recursion
    // 1. basecase start>=end (single element)
    // 2. to do :- divide 
    // 3. inner calls :- 
    // mergeSort(start , mid)
    // mergeSort(mid+1 , end)
    // merge(start , mid , end)

    public static void mergeSort(int[] arr , int start , int end){
        // base case 
        if(start>=end){
            return;
        }

        // to do
        int mid = start + (end-start)/2;

        // mergeSort call
        mergeSort(arr , start , mid);
        mergeSort(arr, mid+1 , end);

        // merge
        merge(arr , start , mid , end);
    }

    public static void merge(int[] arr , int start , int mid , int end){
        // take temporary array
        int[] temp = new int[end-start +1];

        // take 3 iterators
        int i = start;
        int j = mid+1;
        int k = 0;

        // compare and insert in temp
        // when both left and right have elements
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            // every time increase the temp array pointer
            k++;
        }

        // insert in temp
        // when only left side has elements
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        // insert in temp 
        // when only right side has elements
        while(j<=end){
            temp[k++] = arr[j++];
        }
        

        // copy the temp array elements in original array
        for(k=0 ,i =start ; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    // function to print array
    public static void printArr(int[] arr){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      

    public static void main(String[] args){
        int[] arr = {6,3,9,5,2,8};
        printArr(arr);
        // change the actual array 
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}