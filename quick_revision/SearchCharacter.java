import java.util.*;
public class SearchCharacter {

    public static int searchChar(String str , char target){
        int start = 0;
        int end = str.length()-1;

        if(end == 0){
            return -1;
        }

        // this loop is only helpful when we to return bollean values
        // for(char element : str.toCharArray()){
        //     if(element == target){
        //         return true;
        //     }
        // }

        char[] strArr = str.toCharArray();

        for(int i = start;i<=end;i++){
            if(target == strArr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String name = "Ankit";
        System.out.println(searchChar(name, 'i'));
    }
}
