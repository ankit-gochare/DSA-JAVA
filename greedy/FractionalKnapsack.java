import java.util.*;
public class FractionalKnapsack{

    // Fractional knapsack
    // given the weights and values of n items
    // put this items ina knapsack of capacity w 
    // to get the maximum total value in the knapsack 

    // value = [60 , 100 , 120]
    // weight = [ 10 , 20 , 30]
    // w = 50
    // ans =240 
    
    // approach greedy
    // we have to choose maximum value in mininmum possible weight 
    // so we first find the value / weight ratio 
    // then we will sort the ratio array in descending order 
    // if sorting in ascending order then we have to apply the loop from backwards

    // for each ratio if capacity is < current weight 
    // include full add full value

    // if capacity < current weight the 
    // take a fraction of it 
    // and multiply the ratio with the capacity and store the value 

    public static void knapsack(int [] weight , int value[] , int w){
        // create a 2d aray ratio to store value/weight ratio
        double[][] ratio = new double[value.length][2];

        // store values
        for(int i = 0 ; i < value.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = (value[i]/(double)weight[i]);
        }

        // sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int ans = 0;

        for(int i = ratio.length-1 ; i >=0 ; i--){
            int idx = (int )ratio[i][0];
            
            if(capacity >= weight[idx]){
                // include full
                ans += value[idx];
                capacity -= weight[idx];
            }
            else{
                ans += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(ans);
    } 
    public static void main(String[] args){
        int[] value ={60 , 100 , 120};
        int[] weight = {10,20,30};
        int w = 50;

        knapsack(weight, value, w);
    }
}