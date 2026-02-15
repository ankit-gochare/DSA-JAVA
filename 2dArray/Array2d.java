// 2D array - array of arrays
// int matix[][] = new int[row][col];

import java.util.*;

public class Array2d {

    // taking input in 2D array
    public static void input2D(int[][] matrix) {
        int n = matrix.length; // rows
        int m = matrix[0].length;  //columns

        System.out.println("Enter Elments in the array");
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j =0;j<m ;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    // printing the 2D array
    public static void print2D(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // searching in 2D array
    public static void search2D(int[][] matrix , int key){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println(key +" is present at cell : "+"(" + i + "," +j +")");return;
                }
            }
        }
        System.out.println(key + " is not present in the matrix");
    }

    public static void main(String[] args) {
        System.out.println("Happy Mahashivratri ji");
         int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    
        // input2D(matrix);
        // print2D(matrix);
        // search2D(matrix, 5);
        // search2D(matrix, 10);

        spiralMatrixPrint(matrix);
         
    }
}
