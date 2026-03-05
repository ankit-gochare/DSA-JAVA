public class Sudoku {

    // write a function to complete a sudoku
    // find if solution exists or not 
    // if yes then print the solved sudoku
    
    // sudoku
    // the 9*9 grid has 9 3*3 grids
    // numbers are filled from 1 to 9
    // the same should not have duplicate value
    // the same column should not duplicate any value 
    // and also the 3*3 grid should not repeat any value 

    public static boolean sudoku(int[][]  sudoku , int row , int col){
        // base case
        if(row==9){
            return true;
        }

        // recursion
        int nextRow = row ;
        int nextCol = col+1;
        if(col+1==9){
            nextRow = row+1;
            nextCol=0;
        }

        // if value already present 
        // move to next col
        if(sudoku[row][col]!=0){
            return sudoku(sudoku , nextRow , nextCol);
        }

        // otherwisevalue is not present then chcek and place value
        for(int digit = 1  ; digit<=9 ; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudoku(sudoku , nextRow , nextCol)){ // solution exists
                    return true ; 
                }
                sudoku[row][col]=0;
            }
        }

        return false; // solution not exists
    }

    public static boolean isSafe(int[][] sudoku , int row , int col , int digit){

        // column
        for(int i = 0 ; i<9 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // row 
        for(int i = 0 ; i<9 ; i++){
            if(sudoku[row][i] == digit ){
                return false;
            }
        }

        // grid 3*3
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        // chcek in grid
        for(int i = startRow ; i<startRow+3 ; i++){
            for(int j = startCol; j< startCol+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }


    // print sudoku
    public static void printSudoku(int [][] sudoku){
        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        printSudoku(sudoku);

        if(sudoku(sudoku , 0 , 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exists");
        }
    }
}