public class Palindrome {

    // check if a String is a Palindrome 
    // racecar , nitin , naman , madam , noon
    // these are some of the palindromes

    // Algorithm
    //  Approach1
    // take a start and a end pointer
    // start =0;
    // end = str.length()-1;
    // run awhile loop till start<end
    // check condition str.charAt(start) != str.charAt(end)
    // if condition satisfies "not a palindrome"
    // start ++ ; end--;
    
    public static boolean palindrome1(String str){
        int start =0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start) != str.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Algorithm approach2
    // run for loop 0 to str.length()/2
    // if str.charAt(i) != str.charAt(str.length()-1-i)
    // id condition satisfies return false

    public static boolean palindrome2(String str){
        int n = str.length()-1;

        for(int i =0 ;i<=n/2;i++){
            if(str.charAt(i)!= str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "nitin";
        boolean isPalindrome = palindrome1(str);
        System.out.println(isPalindrome);

        String str1 = "ankit";
        boolean isPalindrome1 = palindrome1(str1);
        System.out.println(isPalindrome1);

        String str2 = "nitin";
        boolean isPalindrome2 = palindrome2(str2);
        System.out.println(isPalindrome2);

        String str21 = "ankit";
        boolean isPalindrome21 = palindrome2(str21);
        System.out.println(isPalindrome21);
    }
}
