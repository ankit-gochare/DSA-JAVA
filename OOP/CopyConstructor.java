public class CopyConstructor {
    public static void main(String[] args){
        Student s1 = new Student("Ankit" , 27);

        Student s2 = new Student(s1);

        int[] marks = {98,99,97};

        Student2 s21 = new Student2("Aditya" , 263 , marks);
        Student2 s22 = new Student2(s21);

        s21.marks[0] =90;

        System.out.println(s21.marks[0]);
        System.out.println(s22.marks[0]);

    }   
}

// copy constructor 
// assigns the properties of one object to another object 

// int this below class everything will work fine  
class Student{
    int roll;
    String name;

    Student(String name , int roll){
        this.name = name;
        this.roll = roll;
    }

    // copy constructor
    Student(Student s){
        this.name=s.name;
        this.roll=s.roll;
    }
}

class Student2{
    int roll;
    String name;
    int[] marks;

    Student2(String name , int roll , int[] marks ){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // copy constructor with shallow copy
    // Student2(Student2 s){
    //     marks = new int[3];
    //     this.name=s.name;
    //     this.roll=s.roll;
    //     this.marks =s.marks;
    // }

    // copy constructor with deep copy
    Student2(Student2 s){
        marks=new int[3];
        this.name=s.name;
        this.roll=s.roll;

        for(int i = 0; i<marks.length ; i++){
            this.marks[i]= s.marks[i];
        }
    }
}