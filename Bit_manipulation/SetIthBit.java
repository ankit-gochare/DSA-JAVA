public class SetIthBit {
    // set the ith bit of binary number 
    // set bit means making the bit =1

    // we have find a bit mask in which the ith bit will be 1
    // and all other previous bits are 0 
    // beacuse we will be doing num | bitMask
    // so the ith bit become 1 no mattter whatever it was 
    // and all other bits remain same because or | with 0

    // we can get the bitmask by left shifting 1 i times
    // bitmask = 1<<i

    public static int setIthBit(int num , int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }
    public static void main(String[] args){
        System.out.println(setIthBit(5,3 ));
    }
}
