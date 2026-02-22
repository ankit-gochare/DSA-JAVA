public class TilingProblem{

    // for the advance or also the simple question of recursion 
    // we have to find out 3 things only 
    // and these are must for applying recursive function for solving any problem 

    // 1. base case 
    // 2. what to do 
    // 3. internal calls will take what parameters 


    // given a 2*n floor and tiles of size 2*1 count the no. of ways to tile the given floor using the 2*1 tiles 
    // A tile can either be placed horizontally or vertically 

    // floor = 2*n 
    // tile = 2*1

    // Algorithm approach
    // we first try to take values of n and see what is happening
    // n == 0 , floor -> 2*0 -> there is one way (no tile)
    // n == 1 , floor -> 2*1 -> there is only one way (1 vertical tile)
    // n == 2 , floor -> 2*2 -> there are two ways (both vertical) & (both horizontal)
    // n == 3 , floor -> 2*3 -> thera are 3 ways (all three vertical) & (first 1 vertical then 2 horizontal) & (2 horizontal the 1 vertical )

    // 1 . Base case
    // from here we find the base case 
    // when n== 0 or n==1, return 1

    // 2. what to do 
    // at each level of recursion we have to choices to put the tile on the floor 
    // either we can put the tile horizontal or vertical 

    // case 1 
    // we choose vertical tile 
    // then the length n of the floor to be covered reduced by 1 
    // so we are  left with floor length n-1
    // so we call the function for n-1 now 
    // the function will be 
    // f(n) = vertical + f(n-1)

    // case 2 :-
    // we choose horizontal tile 
    // in this case if we choose a horizontal tile 
    // then the other tile above or below the tile must be horizontal only
    // so when we put 2 tile horizontally the length n of floor reduced by 2
    // so we are left with floor length n-2
    // so we call thefunction for n-2 now
    // the function call will be 
    // f(n) = horizontal + f(n-2)


    // 3. Inner function call 
    // if we choose vertical , pass n-1 in function
    // if we choose horizontal , pass n-2 in function

    // and total number of ways will be the sum of ways by choosing vertical and ways of horizontal
    // total ways = f(n-1) + f(n-2);

    public static int tilingProblem(int n ){
        // base condition
        if(n==0 || n==1){
            return 1;
        }
        // choice 
        // vertical 
        int fnm1 = tilingProblem(n-1);

        // horizontal 
        int fmn2 = tilingProblem(n-2);

        // total ways
        int totalWays = fnm1 + fmn2;

        return totalWays;
    }


    public static void main(String args[]){
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(2));
        System.out.println(tilingProblem(4));
    }
}