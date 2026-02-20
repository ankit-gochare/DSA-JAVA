public class CountSetBits {
    
    // count the number of set bits (1 bits) in agiven random number

    // we will check the lsb of the binary number 
    // and if the lsb == 1 , count++

    // execute this in while loop till n>0
    // and right shift n 1 each time

    // checking the lsb using n & 1 
    // gives 1 if lsb =1 , 0 of lsb == 0

    public static int countSetBits(int num ){
        int count =0;

        while(num > 0){
            if((num&1) != 0){
                count++;
            }
            num>>=1;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countSetBits(10));
    }
}
