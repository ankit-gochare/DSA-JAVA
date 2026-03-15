import java.util.*;

public class Chocola{

    // Chocola problem 
    // also known as 
    // minimum cost to cut board problem

    // by taking example 2*2 example 
    // we understood that

    // 1. we will be using all n-1 + m-1 cuts for a n*m choclate 
    // we just have to decide the order in which we cut to get the minimum coist
    // 2. after each cut the number of pieces increases
    // so from this it is clear that we have to first cut the hight cost cuts 
    // then in the last the lower cost cuts
    // 3. total cost in 1 horizontal cut = no.of vertical pieces cut * cost
    // 3. total cost in 1 vertical cut = no.of horizontal pieces cut * cost

    // what to do 
    // 1. sort the horizontal cut and vertical cut cost in descending order
    // 2. choose the cut that are higher in cost

    public static void minCost(Integer VCosts[] , Integer HCosts[]){
        // sort 
        Arrays.sort(VCosts , Collections.reverseOrder());
        Arrays.sort(HCosts , Collections.reverseOrder());

        int h = 0; // points to the horizintal cost array
        int v = 0; 
        int hp = 1 ; // no. of horizontal pieces
        int vp = 1;
        int cost = 0;

        while(h < HCosts.length && v < VCosts.length){
            if(HCosts[h] <= VCosts[v]){
                // vertical cut
                cost += (VCosts[v] * hp);
                vp++;
                v++;
            }
            else{
                // horizontal cuts
                cost += (HCosts[h] * vp);
                hp++;
                h++;
            }
        }


        while(v < VCosts.length){
            // vertical cut 
            cost += (VCosts[v] * hp);
            vp++;
            v++;
        }

        while(h < HCosts.length){
            // vertical cut 
            cost += (HCosts[h] * vp);
            hp++;
            h++;
        }

        System.out.println(cost);


    }

    public static void main(String[] args){
        Integer[] VCosts = {2,1,3,1,4};
        Integer[] HCosts = {4,1,2};

        minCost(VCosts, HCosts);
    }
}