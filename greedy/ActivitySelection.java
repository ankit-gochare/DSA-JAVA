import java.util.ArrayList;
import java.util.*;

public class ActivitySelection{

    // Activity Selection - greedy
    // you are given n activities with their start and end times 
    // select the max no. of activities that can be performed by a single person 
    // Assuming that a person can only perform 1 activity at a time
    // Activities are sorted acording to end time 

    // start = [10,12,20] end = [20, 25, 30]
    // ans = 2 (A0 & A2)

    // approach 
    // we have to take non overlapping (disjoint activities )
    // the second activity should start after the first ends 

    // as soon as the activity ends it will be beneficial for us 
    // 1. sort based on the end time ( already sorted )
    // 2. select the first activity 
    // mark it s its end time ass the lastend time
    // 3. then select the activities which has the start time >= the lastend time

    public static void activity(int[] start , int[] end){
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // select 1st activity
        maxAct = 1;
        int lastEnd = end[0];
        ans.add(0);

        for(int i = 1 ; i<end.length;i++ ){
            if(start[i] >= lastEnd){
                // selct activity
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum Activities = " + maxAct);

        // print the selected activities
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    // when the activities are not stored according to end time
    // then we have to sort it 

    public static void activity2(int[] start , int[] end){
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // sort the activities based on end time
        // create a 2d array to store index , start and end
        int[][] activities = new int[start.length][3];

        // store 
        for(int i = 0 ; i < start.length ; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));

        // selct 1 activity
        maxAct = 1;
        int lastEnd = activities[0][2];
        ans.add(activities[0][0]);

        // further
        for(int i = 1; i < end.length ;i++){
            if(activities[i][1] >= lastEnd){
                // select activity 
                maxAct++;
                lastEnd = activities[i][2];
                ans.add(activities[i][0]);
            }
        }
        System.out.println(maxAct);

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        int start[] = {10 , 12 , 20};
        int end[] = {20 , 25 , 30};
        activity(start, end);
        activity2(start, end);


        int start1[] = {1,3,0,5,8,5};
        int end1[] = {2,4,6,7,9,9};

        activity(start1, end1);
        activity2(start1, end1);
        
    }
}