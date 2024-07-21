// This is Implementation on Circular Queue using Array
public class MyCircularQueueExample {
    static class Queue{
        static int []arr;
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n ;
        }
        public static boolean isEmpty(){

            return rear==-1 && front==-1 ;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        // Add Element
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue Full Can't Add Element");
                return;
            }
            //when first element added
            if(front==-1){
             front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
            return;
        }
        // Remove element
        public static int dequeue(){
            //when no element in the queue
            if(rear==-1){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            //single element condition
            if(rear==front){
                rear = front = -1;
            }
            else{
                front = (front+1) % size;
            }
            return result;
        }
        //Peek
        public static int peek(){
            if(rear==-1){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        MyQueueExample.Queue q = new MyQueueExample.Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}
