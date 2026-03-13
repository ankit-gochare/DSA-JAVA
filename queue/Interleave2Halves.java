import java.util.Queue;
import java.util.LinkedList;

public class Interleave2Halves{

    // Interleave 2 halves of a queue of even length
    // 1 2 3 4 5 6 7 8 9 10
    // 1 6 2 7 3 8 4 9 5 10

    // 1. divide q in 2 parts 
    // create a new queue
    // and add elements in it till size/2
    // size should be stired in a variable initially

    // now to interleave 
    // add one lement of new q to initial 
    // then one element of initial 
    // repeat this till the new qu becomes empty

    public static void interleave(Queue<Integer> q){
        Queue<Integer> nq  = new LinkedList<>();
        int size = q.size();

        // divide
        for ( int i = 0 ; i < size/2 ; i++){
            nq.add(q.remove());
        }

        // interleave
        while(!nq.isEmpty()){
            q.add(nq.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);


        // print
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();


        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        // print
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        
    }
}