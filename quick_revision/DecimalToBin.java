public class DecimalToBin{

    public static void decimal_Bin(int num){
        int number = 0;
        int power = 0;

        while(num>0){
            int last = num%2;
            number = number + last * (int)Math.pow(10,power);
            power++;
            num/=2;
        }
        System.out.println(number);
    }
    public static void main(String[] args){
        decimal_Bin(4);
    } 
}