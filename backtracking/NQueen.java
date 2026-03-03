public class NQueen {

    // N Queens
    // place n queens on an n*n chessboard
    // such that 2 can not attack each other

    // n queen problem appear in 3 forms
    // 1. Calculate all solutions & print the chessboard
    // 2. count the number of possible solutions
    // 3. possible solution exists or not if yes then print one solution

    // A Queen can move
    // 1. vertical up and down
    // 2. horizntal left and right
    // 3. diagonal left up and down
    // 4. diagonal right up and down

    // Approach
    // if there are n queens
    // and the chessboard size is n*n
    // then it is clear that we can put only 1 queen in a single row
    // same for the column and diagonal too

    // here we take that we have put n queens on n rows
    // 1 in each row

    // forgetting about the attacking of queens we first try to place all n queens
    // in n rows

    // for n = 2
    // we have total 4 ways to place n queens in n rows

    // function to place n queens on n places
    // without considering that queens attack each other
    public static void nQueenWOAttack(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop to place values
        for (int j = 0; j < board.length; j++) {
            // place Queen in the row in the column j
            board[row][j] = 'Q';

            // then call the function for the next row
            nQueenWOAttack(board, row + 1);

            // when 1 board is printed we have to make the space
            // so that the other way solution can be obtatined
            board[row][j] = 'X';
        }
    }

    // now we place queen only if it is safe placing the queen on this place
    // and no other can attack on that queen

    // as we place queen in one row
    // move to the next row

    // and when in a row we are not getting any safe place for the queen
    // then backtrack to the previous row and replace the queen
    // continue this
    // untill we haven't placed all n queens

    // chceking safe place for queen
    // we have to check up only because we are starting from the top
    // 1. vertical up .
    // 2. left diagonal up
    // 3. right diagonal up

    // 1. vertical up
    // we have to only decrease the ro no. till the 0th row

    // 2. left diagonal up
    // decrease the row and col number till row & col >=0

    // 3. right diagonal up
    // decraese the row number till the 0 row
    // increase the column number till the last col

    public static boolean isSafe(char board[][] , int row , int col){
        // vertical up
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left diagonal up 
        for(int i = row-1 , j=col-1 ; i>= 0 && j>=0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal up
        for(int i = row-1 , j=col+1; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    // function to place n queens on n places
    // considering that queens attack each other
    public static void nQueenAttack(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop to place values
        for (int j = 0; j < board.length; j++) {
            // if it is safe
            // place Queen in the row in the column j
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                // then call the function for the next row
                nQueenAttack(board, row + 1);

                // when 1 board is printed we have to make the space
                // so that the other way solution can be obtatined
                board[row][j] = 'X';
            }

        }
    }
    // Time complexity
    // to place n queens in n rows ignoring attack 
    // for 1st queen n choices 
    // for 2nd - nchoice
    // for nth = n choices
    // n *n * n * n ..... ntimes
    // n^n
    // O(n^n)

    // considering attack
    // for 1st - nchoices
    // 2nd - n-1
    // 3rd - n-2 
    // nth - 1
    // n * n-1 * n-2 * n-3 .............*1
    // n!
    // O(n!)

    // T(n) = n * T(n-1) + isSafe()


    // N queens 
    // count total number of solutions / number of ways in which we can solve the n queen problem
    
    // every time 
    // when we are printing the board on base cas e
    // we just increse a cunt variable 
    static int count = 0;
    public static void nQueenCount(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }

        // column loop to place values
        for (int j = 0; j < board.length; j++) {
            // if it is safe
            // place Queen in the row in the column j
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                // then call the function for the next row
                nQueenCount(board, row + 1);

                // when 1 board is printed we have to make the space
                // so that the other way solution can be obtatined
                board[row][j] = 'X';
            }

        }
    }



    // NQueen 
    // check if the problem can be solved or not
    // and if yes yes print 1 solution
    
    // this time we will set board places to X only when solution does not exist 
    // and after hitting base case for the first time  return true 
    public static boolean nQueen1Solution(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            return true;
        }

        // column loop to place values
        for (int j = 0; j < board.length; j++) {
            // if it is safe
            // place Queen in the row in the column j
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                if(nQueen1Solution(board, row + 1))
                {
                    return true;
                }
                board[row][j] = 'X';
            }

        }
        return false;
    }




    // printing the board
    public static void printBoard(char[][] board) {
        System.out.println(".....................Chess Board.............");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];

        // initialize the board with x on each place
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // print the board initially
        printBoard(board);

        // call function to place nqueens on n places
        //nQueenWOAttack(board, 0);


        // call function to place nqueens on n places
        nQueenAttack(board, 0);

        // return count of possible solutions
        nQueenCount(board , 0);
        System.out.println(count);

        if(nQueen1Solution(board, 0)){
            System.out.println("Solution exists");
            printBoard(board);
        }
        else{
            System.out.println("Solution not possible");
        }


    }
}