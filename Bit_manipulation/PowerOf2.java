public class PowerOf2 {
    
    // check if a given number is power of 2 or not
    // 2 , 4 , 8 , 16 are power of 2

    // we have pattern t
    // that if a number n is a power of 2
    // then n&(n-1) == 0 always

    // because if an number is power of 2 then it will have only a single 1 in the ned at MSB side
    // and the number-1 will always have 0 at the ned in MSB side 
    // So it will always give 0

    public static boolean powerOf2(int num){
        return (num & (num-1)) == 0;
    }

    public static void main(String[] args){
        System.out.println(powerOf2(4));
        System.out.println(powerOf2(7));
        System.out.println(powerOf2(8));

    }
}
