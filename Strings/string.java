import java.util.Scanner;

public class string {

    public static void inputInString(){
        Scanner sc = new Scanner(System.in);

        // single world
        String name = sc.next();

        // multiple words / lines
        String bio = sc.nextLine();
    }
    
    public static void main(String[] args){
        char[] strArr = {'a' , 'n' , 'k' , 'i' , 't'};

        String str1 = "ankit";
        String str2 = new String("ankit"); // string object

        // Strings are immutable

        // taking input in Strings
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        // single world
        String name = sc.next();

        System.out.println("Add to your Bio");
        // multiple words / lines
        String bio = sc.nextLine();


        // length of a string
        System.out.println(name.length());

        // concatenation of strings
        String userInfo = name+" "+bio;
        System.out.println(userInfo);


        // Accessing individual elements of a string
        System.out.println(name.charAt(0)); 
        System.out.println(name.charAt(1)); 
        System.out.println(name.charAt(2)); 
        System.out.println(name.charAt(3)); 
        System.out.println(name.charAt(4)); 
        // System.out.println(name.charAt(5)); // out of bound


        // printing letters of a given string
        System.out.println("THe individual characters in the string are :");
        for(int i =0; i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();



    }
}
