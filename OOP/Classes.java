public class Classes{
    public static void main(String[] args){

        // creating object the Student class
        Student s1 = new Student();
        s1.setName("Ankit");
        s1.setRoll(27);

        System.out.println(s1.getName());
        System.out.println(s1.getRoll());

        // we can also access the data directly if it is not private
        Student s2 = new Student();
        s2.name = "Aditya";
        s2.roll = 263 ;

        System.out.println(s2.name);
        System.out.println(s2.roll);
    }

}

// there is only a single public class in a single java file
// that to with name same as the java file

// all the classes other than the public class should be 
// created after the public class

// classes name in java must stat with a Capital letter
class Student{
    String name;
    int roll;

    void setName(String name){
        this.name=name;
    }

    void setRoll(int roll){
        this.roll = roll;
    }

    String getName(){
        return this.name;
    }

    int getRoll(){
        return this.roll;
    }
}