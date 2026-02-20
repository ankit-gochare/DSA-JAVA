public class ClearIthBit {

    // clear the ith bit of a given number ,
    // clear the ith bit means ith bit = 0

    // here we have to use a bitmask in which 
    // there is 0 on the ith bit and 1 at all other bits 
    // so we can do num & bitmask
    // so ith bit become 0 because of & with 0
    // and all other bits remain same because & with 1 
    
    // by left shifting 1 i times we can get 
    // 1 on ith bit and 0 on other 
    // it is just the complement of what we need
    // so the bitmask = ~(1<<i)

    public static int clearIthBit(int num , int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }
    public static void main(String[] args){
        System.out.println(clearIthBit(5, 0));
    }
}
