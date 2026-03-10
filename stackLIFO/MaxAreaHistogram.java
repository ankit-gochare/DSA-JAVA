import java.util.Stack;

public class MaxAreaHistogram{
    
    // Maximum Area in Histogram
    // Given an array of integers heights representing the hidtogram's bar height 
    // where the width of each bar is 1 
    // return the area of the largest rectangle in this histogram 

    // heights = [2,1,5,6,2,3]
    // ans = 10

    // approach
    // area = height * width
    // for the area to be the largest 
    // either the height or the width should be the maximum

    // width is fixed 1 for all
    // so we will chcek according to the height 

    // for each bar height we have to calculate the left boundary and right boundary to find the width of the rectangle 
    // for the given height bar

    // we can only inlude the left or right side bar if their height id greater than the current bar 

    // the boundaries are nothing but the next smaller elements 
    // and width = nextSmallerRight - nextSmallerLeft - 1

    // 1. create a stack 
    // 2. create 2 array nsr and nsl

    // if for some bar there is no smaller element in left then it will be -1
    // if for some bar there is no smaller element in right then it will be heights.size

    // find the next smaller using this data structures 
    // then calculate width 
    // and then area 
    // then compare it to the max Araea initiallly 0

    // time complexity O(n)
    public static void maxArea(int[] heights){
        int maxArea = 0;

        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i = heights.length-1; i >=0 ; i--){
            int curr = heights[i];

            // pop from the stack 
            while(!s.isEmpty() && heights[s.peek()] >= curr){
                s.pop();
            }

            // store indexes in nsr
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }
            else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for(int i = 0; i <heights.length ; i++){
            int curr = heights[i];

            // pop from the stack 
            while(!s.isEmpty() && heights[s.peek()] >= curr){
                s.pop();
            }

            // store indexes in nsl
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }


        // curent area 
        for(int i= 0 ; i< heights.length ;i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args){
        int arr[] = {2,1,5,6,2,3};
        int arr1[] = {2,4};

        maxArea(arr);
        maxArea(arr1);
    }
}