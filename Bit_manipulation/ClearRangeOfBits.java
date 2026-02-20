public class ClearRangeOfBits {
    
    // clear range of bits 
    // means we i as the start bit
    // and j as the end bit 
    // from i to j  we have make all bits 0 


    // here we need a bit mask 
    // in which there is 0 where we have to perform clear operartion ( i To j)
    // and remaining bits should be 1
    // so when we perform num & bitmask only the bits in the range are cleared 
    // and all others remains same 

    // we have to use 2 temporary bitmask to get the actual bitmask 
    // temp bitmask1 , here all the bits from j+1 to last are 1
    // temp bitmask2 , here all the bits till i -1 are 1
    // and remaing in both are 0

    // and when we perform bitmask1 | bitmask2 
    // we get the required bitmask in which we have
    // 0 in all bits where we have to perform clear operation 
    // and 1 in all bits we have left same 

    // but how willl we find bitmask1 and bitmask2
    // bitmask1 needs the same condition as clear last i bits 
    // bitmask1 = ~(0)<<(j+1)

    // and bitmask2 
    // whenever we need all 0 in the left
    // and all 1 in the right in any binary number 
    // then in right till which position we want 1 
    // we can get it by doing (2^position - 1)
    // which is nothing but bitmask2 == (1<<i)-1;

    public static int clearRangeBits(int num , int i , int j){
        int bitmask1 = ~(0)<<(j+1);
        int bitmask2 = (1<<i)-1;
        int bitmask = bitmask1 | bitmask2;
        return num & bitmask;
    }

    public static void main(String[] args){
        System.out.println(clearRangeBits(127 , 3 , 7));
    }


}
