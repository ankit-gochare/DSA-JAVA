import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{

    // ArrayList
    // we cannot store primitive datatypes
    // we can only store using classes
    // we do not have to specify the size of ArrayList
    // dynamic size

    // to use import ArrayList
    // ArrayList can be of any datatype but classes


    public static void main(String[] args){
        // declaring an Arraylist
        ArrayList<Integer> list = new ArrayList<>();


        // opeartions on ArrayLists

        // addding element in ArrayList // O(1)
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);

        // getting individual elemnts // O(1)
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.get(1));

        // remove element // O(n)
        list.remove(1);

        // update the element  // O(n)
        list.set(2,99);

        // contains elemnet - true or false  // O(n)
        list.contains(99);

        // insert at some index  // O(n)
        list.add(1,999);

        // printing the arrayList
        System.out.println(list);

        // size of the arrayList
        System.out.println(list.size());

        // printing the Arraylist using loop
        System.out.println("ArrayList");
        for(int i =0 ;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        } 
        System.out.println();

        // printing the arraylist reverse
        System.out.println("reverse ArrayList");
        for(int j = list.size()-1 ; j>=0 ; j--){
            System.out.print(list.get(j)+" ");
        }
        System.out.println();



    }
}