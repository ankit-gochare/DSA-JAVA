`       public class ShortestPath {
    // given a route containing four directions NEWS find the shortest path to reach destination
    // WNEENESENNN

    // Approach
    // we have to find displacement here 
    // where we have to start from (0,0)
    // and after following the path we get the destination coordinates (x2 , y2)
    // we have to apply formula Math.sqrt((x2-x1)^2 + (y2-y1)^2);

    // how to find the destination coordinates
    // take x =0;
    // and y = 0;
    // run a for loop from 0n to path.length()-1
    // if direction = north , then y++
    // if direction = south , then y--
    // if direction = west , then x--
    // if direction = east , then x++

    // then after getting the coordinates apply the displacement formula

    public static float shortestPath(String path){
        int x =0;
        int y=0;
        for(int i=0 ;i<path.length();i++){
            char direction = path.charAt(i);

            // S = south
            if(direction == 'S'){
                y--;
            }

            // N = North
            else if(direction == 'N'){
                y++;
            }

            // E = East
            else if(direction == 'E'){
                x++;
            }

            // W = West
            else{
                x--;
            }

        }
        // displacement
        int x2 = x*x; // square because x1 will always be 0
        int y2 = y*y; // same here 0
        return (float)Math.sqrt(x2+y2);
    }


    public static void main(String[] args){
        String path1 = "WNEENESENNN";
        float destination = shortestPath(path1);
        System.out.println(destination);
    }
}
