import java.util.Stack;

public class StockSpan{

    // max no. of days (consecutive days) for which 
    // price <= today'ss price

    // span is nothing but 
    // before how many days the price was higher than today's price  

    // span = i - prevHigh
    // for day 1 the span will be 1 only

    // approach1 
    // check for each price one by one 
    // this will take O(n^2) time 


    // appraoch2 
    // using stack 
    // create a stack
    // and store the index of previous High

    // and also a array to store span
    // same size as the input price array

    // span of day0 is always 1
    // store 1 in the span array at 0 index 
    // and push 0 in gthe stack

    // now for and after the index1 price
    // pop from the stack till the prices are <= the current price 
    // or the stack become empty

    // then if the stack gets empty return current index +2
    // else mark the peek element as the prevHigh
    // subtarct the top element index from the current index and return this

    public static void stockSpan(int[] stocks , int span[] ){
        // create a stack
        Stack<Integer> s = new Stack<>();

        // day 0 span = 1
        span[0] = 1;
        s.push(0);

        // pop from the stack
        for(int i =1 ; i <stocks.length ; i++ ){
            int currPrice = stocks[i];

            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }

            // if empty return i + 2
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            // push i into the stack
            s.push(i);
        }
    }
    public static void main(String[] args){
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        // print the span
        for(int i = 0 ; i<span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
}