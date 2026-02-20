public class Modifier {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();

        myAcc.userName = "Ankit";
        //  myAcc.password = "the ultimate secret"; // give error

        myAcc.setPassword("ab tumse kya chhupana");

        System.out.println(myAcc.userName);
        // System.out.println(myAcc.password); // give error 

    }
}

// we have 4 access modifiers
// 1. private 
// accessed within the class only

// 2. default (when we dont declare any access modifier)
// accessed within the class and within the package

// 3. protected
// accessed within the class , within the package and outside package by subclass only

// 4. public
// accessed anywhere

class BankAccount{
    public String userName;
    private String password;
    public void setPassword(String pwd){
        this.password=pwd;
    }
}
