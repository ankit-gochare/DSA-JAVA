

public class spiralMatrix {
    // 1. spiral matrix
    // for a 2D matrix 
    // int[][] matrix = {
    //     {1, 2, 3},
    //     {4, 5, 6},
    //     {7, 8, 9}
    // };

    // the output
    // 1 2 3 6 9  8 7 4 5

    // Algorithm 
    // we have to follow the  boundary approach
    // in this approach we will start from the top
    // then we print the right 
    // then bottom 
    // and then left in the last 

    // we have to initialize 4 varibales
    // startRow = 0
    // endRow = matrix.length-1
    // startCol = 0
    // endCol = matrix[0].length

    // then we apply while loop
    // then in the loop after printing
    // top , right , bottom and left 
    // we will increment stratRow and startCol
    // and decrement endRow and endCol

    // the break condition of the while loop will be 
    // while(startCol <= endClol && startRow <= endRow)

    // 1. <= taking in consideration that we will face odd no. of rows also 
    // 2. && because we can have n*m matrix also
    // * we have add one condition in both bottom and left , beacuse if we have odd number of columns then we willl be left with a single element in the end 
    // so the element willl be printed by top only 
    // therefore we have to stop bottom and left 
    // otherwise the elemnt will printed more than once 
    // if(startCol == endCol)
    // {
    //     return;
    // } 

    public static void spiralMatrixPrint(int [][] matrix){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow<= endRow && startCol<= endCol){
            // top
            for(int i =startCol ; i<=endCol  ;i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            // right
            for(int j = startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }

             // bottom
            if(startRow < endRow){
                for(int i = endCol - 1; i >= startCol; i--){
                    System.out.print(matrix[endRow][i]);
                }
            }

            // left
            if(startCol < endCol){
                for(int i = endRow - 1; i > startRow; i--){
                    System.out.print(matrix[i][startCol]);
                }
            }

            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Happy Mahashivratri ji");
         int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
        spiralMatrixPrint(matrix); 
    }
}
