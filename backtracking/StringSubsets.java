public class StringSubsets{

    // Find Subsets
    // Find and print all suvsets of a given string
    // if the string is abc 
    // then the subsets of abc are 
    // a b c ab bc ac abc null

    // for n length string 
    // the number of subsets is 2^n

    // approach 
    // to make subsets from any string
    // for each time we making anew subset 
    // we have 2 choices for a single character 
    // 1. either we taje it 
    // 2. we don't take it 
    // we are using this thing only 
    // first we tae it (yes)
    // then we dont (no)

    // we take an empty string ans 
    // and according to condition if 
    // yes 
    // ans + str.charAt[i]
    // no 
    // ans 

    // base case 
    // when i == str.length()
    // i will be pointing the string index 
    // and wehenever we hit the base case 
    // print ans 

    // and remember we have to print null if there is empty string

    public static void StringSubsets(String str , String ans , int i){
        // base case
        if (i == str.length()){
            if(ans.length() == 0 ){
                System.out.println("null");
                return;
            }
            else{
            System.out.println(ans);
            return ;
            }
        }

        // choice yes 
        StringSubsets(str , ans + str.charAt(i), i+1);

        // choice no
        StringSubsets(str , ans , i+1);

    }
    // the time complexity for the function is O(n*2^n)
    // because the number of subsets is 2^n
    // and for 1 subset we need n time  
    public static void main(String[] args){
        String str = "abc";
        String ans = "";
        StringSubsets(str , ans , 0);
    }
}