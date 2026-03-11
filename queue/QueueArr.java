public class QueueArr{

    // Queue implemented using Array
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n ){
            arr = new int[n];
            size=n;
            rear = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear==-1;
        }

        // isFull
        public static boolean isFull(){
            return rear == size-1;
        }

        // add 
        public static void add(int data){
            // if full return 
            if(isFull()){
                System.out.println("The Queue is full");
                return ;
            }

            // if nnot full
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove(){
            // is empty then return -1
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }

            // if not empty return the first element
            int front = arr[0];

            // then move elements one index before
            for(int i=0 ; i<rear ; i++){
                arr[i] = arr[i + 1];
            }

            // then update rear
            rear = rear -1;

            return front;
        }

        // peek()
        public static int peek(){
            // if empty return -1
            if(isEmpty()){
                System.out.println("the Queue is empty");
                return -1;
            }

            // return first element 
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        q.remove();

        // print and delete 
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}