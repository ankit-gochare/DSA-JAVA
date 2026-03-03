public class GridWays{

    // Grid Ways
    // Find number of ways to reach from (0,0) to (n-1 , m-1) in a n*m grid
    // Allowed moves right or down
    
    // At ecah cell we have two choices 
    // 1. right 
    // 2. down 

    // if the cell is (x,y)
    // then down (x+1 , y)
    // right (x , y+1)

    // an d in this the problem is now reduced 
    // and we get w1 ways from right 
    // and w2 ways from left 
    // and then we calculate total ways = w1 + w2

    // base case 
    // when we reach the target (n-1 , m-1)
    // return 1 
    // because if we are at the target then we have 1 way
    // and also if we are going out of the boundary then
    // return 0

    public static int gridWays(int i , int j , int n , int m){
        // base case
        if(i==n-1 && j==m-1){ // target reached
            return 1;
        }
        else if(i == n || j == m){ // boundary cross
            return 0;
        }

        // down 
        int w1 = gridWays(i+1, j, n, m);

        // right
        int w2 = gridWays(i , j+1 , n , m);
        return w1+w2;

    }
    // the time complexity of this is O(2^(n+m))
    // because we have 2 choices on each level 
    // and we have n+m cells

    // to get 1 possible way 
    // no. of down turns = n
    // no.of right turns = m 
    // total turn = m+n

    // so time is O(2^(n+m))
    // which very much 
    // therefire we use a trick instead


    // trick for gridways problem 
    // we use permutations here 

    // if we are reaching from any path to target
    // then we must have taken n-1 down moves
    // and m-1 right moves 
    // for n =3 
    // RRDD DRDR RDRD etc. total 6

    // so we take this moves as characters 
    // and let we have n-1 D characters 
    // and m-1 R charcters 
    // and we have to make all possible permutations using this characters 
    // total characters = (n-1 + m-1)
    // total ways  = ((n-1 + m-1)!) / ((n-1)! * (m-1)!)

    public static int gridWaysT(int n , int m ){
        int n1 = fact(n-1);
        int m1 = fact(m-1);
        int n1m1= fact((n-1)+(m-1)) ;
        return (n1m1)/(n1*m1);
    }

    public static int fact(int n){
        // base case
        if(n == 0 || n==1){
            return 1;
        }

        int facto = n * fact(n-1);
        return facto;
    }


    public static void main(String[] args){

        System.out.println(gridWays(0, 0, 3, 3));

        System.out.println(gridWaysT(3, 3));

    }
}