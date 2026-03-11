import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF{
    public static void main(String[] args){

        // Queue uising Java collection framework
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        System.out.println(q1);

        q1.remove();
        q1.remove();
        System.out.println(q1);

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);

        System.out.println(q2);

        q2.remove();
        q2.remove();
        System.out.println(q2);

    }
}