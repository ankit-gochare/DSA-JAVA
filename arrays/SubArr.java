public class SubArr{

    public static void subArr(int[] arr){
        int start =0;
        int end = arr.length-1;

        for(int i =start ; i<=end;i++){
            for(int j = i; j<=end ; j++){
                for(int k =i ; k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] ={2,4,6,8,10};
        subArr(arr);
    }
}