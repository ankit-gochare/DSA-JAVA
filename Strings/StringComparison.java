public class StringComparison {
    public static void main(String[] args){
    // to compare two strings == do not work with 
    // String str = new String("abc");
    // this type of initialization
    // because == check for the same address 
    // and not for the value 

    // it works for 
    // String str1 = "abc";
    // String str2 = "abc";
    // because here both will point to the same addresss 

    String s1 = "tony";
    String s2 = "tony";
    String s3 = new String("tony");

    if(s1==s2){
        System.out.println("Strings are equal"); // this will execute
    }
    else{
        System.out.println("Strings are not equal");
    }

    if(s1==s3){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal"); // this will execute
    }

    // so to avoid this interning problem 
    // we have to use .equals() method
    // it checks for the vallue and not the address
    if(s1.equals(s2)){
        System.out.println("Strings are equal");  // this wille execute
    }
    else{
        System.out.println("Strings are not equal");
    }

    if(s1.equals(s3)){
        System.out.println("Strings are equal"); // this will execute
    }
    else{
        System.out.println("Strings are not equal");
    }
    }
}
