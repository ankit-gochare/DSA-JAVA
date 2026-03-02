public class PairsArr{

    public static void pairsArr(int[] arr){
        int start =0;
        int end = arr.length-1;
        int total =0;
        for(int i =start ; i<=end ;i++){
            int current = arr[i];
            for(int j = i+1 ; j<=end;j++){
                System.out.print("("+ current+"," +arr[j]+")" + "   " );
                total++;
            }
            System.out.println();
        }
        System.out.println(total);
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        pairsArr(arr);
    }
}