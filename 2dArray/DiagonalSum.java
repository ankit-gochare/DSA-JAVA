public class DiagonalSum {

    // Diagonal sum 
    // only applicable for square matrices

    // Algorithm for diagonal sum 
    // therea are 2 diagonals in the matrix 
    // 1. primary Diagonal :- 
    // left top(0,0) -> right bottom(n-1 , n-1)
    // 2. secondary Diagonal :-
    // right top(0,m-1) -> left bottom(n-1,0)

    // we have to find the sum of primary diagonal 
    // then the sum of secondary diagonal 
    // and hence we get the total sum 

    // but we have to remember that in case of odd number ordered matrix
    // the middle element will be present in both primary and secondary diagonals
    // so it will be counted in the total sum 2 times 

    // 1. brute force approach for finding diagonal sum 
    // visit every element and verify the condition for diagonal elements or not 
    // for primary diagonal elements i == j
    // for secondary diagonal elements i + j = row

    // if the condition matches add the number to sum 
    // this will handle the overlapping element too

    public static int diagonalSum1(int matrix[][]){
        int start = 0;
        int row = matrix.length-1;
        int col = matrix[0].length;
        int sum = 0;

        // access each element and check 
        for(int i = start;i<=row ;i++){
            for(int j = start;j<=col;j++){
                // primary diagonal
                if(i == j){
                    sum+=matrix[i][j];
                }

                // secondary diagonal
                else if(i+j == row){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    // but the timecomplexity of this function is O(n^2)

    // 2. optimized approach :- O(n)
    // i + j = row   ==    j = row-1 
    // without traversing each element directly applying conditions in a single loop

    public static int diagonalSum2(int matrix[][]){
        int start =0;
        int row = matrix.length-1;
        int sum =0;

        for(int i= start; i<=row ;i++){
            // primary diagonal
            sum+=matrix[i][i];

            // secondary diagonal 
            if(i!= row-i){ // to handle the overlapping element 
                sum+= matrix[i][row-1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int ans1 = diagonalSum1(arr);
        System.out.println(ans1); //25

        int ans2 = diagonalSum2(arr);
        System.out.println(ans2); //25
    }
}
