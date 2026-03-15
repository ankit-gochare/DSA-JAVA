import java.util.*;

public class IndianCoins{

    // we are given an infinite supply of denminations
    // [1,2,5,10,20,50,100,200,500 ,2000]

    // Find minimum numnber of notes/coins to make change for an Amount 
    // amount = 121 
    // ans = 3(100 + 20 + 1)

    // amount = 590
    // ans = 4(500 + 50 + 20 + 20 )

    // approach 
    // greedy approach 
    // the greedy approach does not work on all coin systems 
    // and the coin system that follows greeedy approach is called the  canonical coin system 
    // and Indian coin system is also a canonical coin system 


    // approach
    // give the larget possible note first then 
    // do the same for the remaining amount 

    // 1. sort the coin system order in decsending order 
    // then compare with one by one coin 
    // till the amount is greater than the coin value keep giving that coin
    // and if the amount becomes less than the coin value 
    // go to the next coins

    public static void minCoins(Integer [] coins , int amount){
        // sort the coins
        Arrays.sort(coins , Comparator.reverseOrder());

        int count = 0 ;

        // to store the notes/ coins 
        ArrayList<Integer> notes = new ArrayList<>();

        // count
        for(int i = 0 ; i<coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i]<= amount){
                    notes.add(coins[i]);
                    amount -= coins[i];
                    count++;
                }
            }
        }

        System.out.println("Minimum notes/coins : " + count);

        System.out.println(notes);

    }

    public static void main(String[] args){
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        
        minCoins(coins, 121);
        minCoins(coins, 590);
        minCoins(coins, 1058);
    }
}