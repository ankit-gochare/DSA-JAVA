public class BinaryToDec{

    public static void binary_Dec(int num){
        int power = 0;
        int number = 0;

        while(num>0){
            int last = num%10;
            number = number + last * (int)Math.pow(2, power);
            power++;
            num/=10;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        binary_Dec(100);
    }

}