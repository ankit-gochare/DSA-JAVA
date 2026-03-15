import java.util.*;

public class JobSequencing{
    
    // Job sequencing problem
    // jobsInfo = { {4,20} , {1,10} , {1,40} , {1,30}}
    // maxProfit = 60 from 2nd and 0th

    // approach 
    // brute force approach
    // try all possible sequence and then compare the profits and 
    // return the maxProfits

    // but the time complexity will be very bad

    // approach2 
    // greedy approach

    // 1. sort the jobs based on the profits in decreasing order
    // 2. then take time varibale to track the time
    // 3. take an arraylist sequence to store the sequence of jobs

    // start from the higher profit job 
    // if time < = deadline then take the job 

    // for creating jobs 
    static class Job{
        int deadline ; 
        int profit;
        int id;

        public Job(int i , int d , int p){
            id = i ;
            deadline = d;
            profit =p;
        }
    }

    public static void jobSeq(int[][] jobsInfo){
        // create jobs arrayList using the Job class
        ArrayList<Job> jobs = new ArrayList<>(); 

        for(int i = 0 ; i< jobsInfo.length ; i++){
            jobs.add(new Job(i , jobsInfo[i][0] , jobsInfo[i][1]));
        }

        // now sort the jobs in descending order of profits
        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit); 

        // Arraylist to store the sequence
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i = 0; i<jobs.size() ; i++){
            Job curr = jobs.get(i);

            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq);

    }

    public static void main(String[] args){
        int [][] jobsInfo = { {4,20} , {1,10} , {1,40} , {1,30}};
        jobSeq(jobsInfo);
    }
}