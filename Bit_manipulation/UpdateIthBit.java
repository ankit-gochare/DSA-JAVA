public class UpdateIthBit {

    // we have to update the ith bit of a given number to the 
    // given newBit (either 0 or 1)

    // firste we have a simple approach 
    // if we have the newBit == 0 
    // call clearIthBit for the given number 
    // else call setIthBit for the given number
    
    public static int setIthBit(int num , int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }

    public static int clearIthBit(int num , int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }

    public static int upadateIthbit(int num , int i , int newBit){
        if(newBit == 0){
            return clearIthBit(num, i);
        }
        else{
            return setIthBit(num, i);
        }
    } 


    // Approach 2
    // first clear the Ith bit (ith bit will become 0)
    // now we need a bit mask with the newBit on the ith bit 
    // and 0 at all other places 
    // and then we perform newNum | bitmask
    
    // the bitmask will be obtsined by left shifting newBit i times
    // bitmask = newBit<<i

    public static int updateIthBit2(int num , int i , int newBit){
        int newNum = clearIthBit(num, i);

        int bitmask = newBit<<i;
        return newNum | bitmask;
    }

    public static void main(String[] args){
        System.out.println(upadateIthbit(5, 1, 1));
        System.out.println(upadateIthbit(5, 1, 1));
    }
}
