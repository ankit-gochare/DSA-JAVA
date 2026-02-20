
public class GetIthBit {

    // from any given random number we have to find the ith bit (0 or 1)

    // when we find odd or even number we check the 0th bit 
    // here we have to check the ith bit 

    // so we also have to find the bitmask here
    // so we have make the ith bit of the bitmask 1 
    // by doing 1<<i
    // so only ith bit is 1 
    // and all less than i are 0

    // then we perform num & bitmask 
    // if 0 return 0
    // else return 1


    public static int getIthBit(int num , int i){
        int bitmask = 1<<i;

        if((num & bitmask )== 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(getIthBit(1100, 3));
    }
}
 