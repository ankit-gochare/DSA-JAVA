public class Constructor{
    public static void main(String[] args){
         Student S1 = new Student();
          // System.out.println(s1.name); // error
         // System.out.println(s1.roll); // error

         Student s2 = new Student(27);
         System.out.println(s2.roll);
        //  System.out.println(s2.name); // error

         Student s3 = new Student("Ankit");
         System.out.println(s3.name);
        //  System.out.println(s3.roll); // error
        
         Student s4 = new Student(263 , "Aditya");
         System.out.println(s4.name);
         System.out.println(s4.roll);
    }
}

// Constructor is a speacial method which is invoked automatically 
// at the time of object  creation

// Constructirs :-
// have the same name as the class name
// do not have any return type
// only call once at object creation
// memory allocation happens when it is called
// used to initialize objects

// types of constructor
// 1. non parameterized
// 2. parameterized
// 3. copy constructor

class Student{
    int roll;
    String name;

    Student(){
        System.out.println("The Non parameterized constructor is called because no arguments are passed to the constructor");
    }

    Student(int roll){
        System.out.println("The parameterized constructor with roll is called becuase roll is passed in t constructor");
        this.roll =roll;
    }

    Student(String naam){
        System.out.println("The parameterized constructor with name is called becuase name is passed in the constructor");
        this.name =naam;
    }

    Student(int roll , String name){
        System.out.println("The Parameterized constructor with name and roll is called becuase name and roll are passed in the constructor");
        this.name = name;
        this.roll = roll;
    }
}



