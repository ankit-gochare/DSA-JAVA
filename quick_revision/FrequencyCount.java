public class FrequencyCount {

    // [1, 2, 1, 3]
    // expected output
    // 1 → 2 times
    // 2 → 1 time
    // 3 → 1 time

    public static void frequencyCount(int[] arr){
        int start=0;
        int end = arr.length-1;

        // outer loop takes each element one by one
        for(int i=start ; i<=end ;i++){
            // inner loop checks how many times repeated for each element
            int count=1;

            // already counted
            if(arr[i]== -1){
                continue;
            }

            for(int j = i+1; j<=end;j++){
                if(arr[j] == arr[i]){
                    count++;
                    arr[j]=-1; // mark counted
                }
            }
            System.out.println(arr[i]+" -> " + count + "times");
        }
        
    }

    public static void main(String[] args){
        

    }
}
