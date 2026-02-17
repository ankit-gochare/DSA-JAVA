public class SearchSortedMatrix {

    // Search in sorted matrix
    // search for a key in a row wise and column wise sorted matrix
    // int[][] arr = {{10,20,30,40} , {15,25,35,45} , {27,29,37,48} , {32,33,39,50}};

    // approach1 
    // brute force approach 
    // traverse each elemnt till we get the element 
    // O(n^2)

    // approach2 : staircaseSearch O(n+m)
    // we will use row wise & col wise sorted 
    // we will use binary search
    
    // in most of the elements of the matrix we cannot decide where to go next but 
    // we have only two elements in the matrix by starting from which we have definite option of where to go next
    // 1. top right of the secondary diagonal (0, m-1) m=colTotal
    // 2. bottom left of the secondary diagonal (n-1 ,0) n=rowTotal

    // we can start from either of the elements

    // the while loop end condition willl be when 
    // the col number reaches to 0 
    // the row number reaches to n-1

    public static void searchSortedArr(int[][] matrix , int key){
        // starting from the top right elemnt (0.m-1)
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println(key + " is present at (" + row + "," + col +")");
                return;
            }

            else if(matrix[row][col]<key){
                // move to bottom 
                row++;
            }
            else{
                // move to left
                col--;
            }
        }
        System.out.println("key element is not present");
        return;
    }

    public static void stairCaseSum2(int[][] matrix , int key){
        // starting form the bottom left (n-1,0)
        int row = matrix.length-1;
        int col = 0;

        while(row >=0 && col<=matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println(key +" is present at (" + row +"," +col+")");
                return;
            }

            else if(matrix[row][col] < key){
                // move right
                col++;
            }

            else{
                // move up
                row--;
            }
        }
        System.out.println("The key elemnet is not present");
        return;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        
        searchSortedArr(arr, 5);
        stairCaseSum2(arr, 5);
    }
}
