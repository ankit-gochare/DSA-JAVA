public class StringPermutations{

    // Find Permutations 
    // Find and print all the permutations of a String of a string 
    // abc 
    // abc acb bac bca cab cba 

    // for n length string 
    // n! permutations

    // to find permutations of an n length string 
    // at first level we have n choices 
    // the second level n-1 choices
    // then n-2 
    // and so on 


    // we will take ans as a new string and 
    // we insert values in ans 
    // and remove from str 
    // and when the original string gets empty it is 
    // base case
    // when str.length == 0
    // print ans 

    public static void stringPermutations(String str , String ans){
        // base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i =0; i<str.length() ; i++){
            char curr = str.charAt(i);

            // abcde => ab = de = abde
            String newStr = str.substring(0,i) + str.substring(i+1);

            // inner call
            stringPermutations(newStr , ans + curr);
        }
    }
    // the time complexity of this algo will be O(n*n!)
    // because the number of permutations is n!
    // and to find 1 permutation we need n time 

    public static void main(String[] args){
        String str = "abc";
        stringPermutations(str, "");
    }
}