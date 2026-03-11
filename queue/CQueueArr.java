public class CQueueArr{

    // Circular Queue implemented using Array
    static class CQueue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        CQueue(int n){
            arr = new int[n];
            size = n;
            rear = front = -1;
        }

        // is Empty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // is full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // add 
        public static void add(int data){
            // is full 
            if(isFull()){
                System.out.println("The Queue is full");
                return;
            }

            // if it is 1st element
            if(front == -1){
                front = 0;
            }
            
            rear = (rear + 1)% size;
            arr[rear] = data;
        }

        // remove
        public static int remove(){
            // is empty return -1
            if(isEmpty()){
                System.out.println("the Queue is empty");
                return -1;
            }

            int result = arr[front];
            
            // if last element
            if(rear == front){
                rear = front = -1;
            } 
            else{
                front = (front + 1)% size;
            }

            return result;
        }


        // peek()
        public static int peek(){
            // is empty return -1
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args){
        CQueue cq = new CQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);

        while(!cq.isEmpty()){
            System.out.println(cq.remove());
        }
    }
}