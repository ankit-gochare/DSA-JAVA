public class ClearLastIBits {
    
    // we have to clear the last i bit of a given random number
    // last bits from the lsb side 

    // wkt , bits are cleared by doing & with 0
    // so we need a bitmask where there is 0 till the ith place and
    // after that all bits are 1
    // then we perform num & bitmask 

    // the bitmask
    // if we do 0<<i
    // we will get alll the bits as 0

    // but when we complement 0 
    // it will be 1 on the bits (becuase the ~0 == -1)
    // so if we left the ~(0) i times then we get 
    // 0 on the first i bits form the lsb side 
    // remaining are 1
    // so bitmask = ~(0)<<i

    public static int clearLastIBits(int num , int i){
        int bitmask = ~(0)<<i;
        return num & bitmask; 
    }
    public static void main(String[] args){
        System.out.println(clearLastIBits(15, 2));
    }
}
