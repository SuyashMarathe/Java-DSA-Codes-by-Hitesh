import java.util.*;
public class MyQueueExample {
    static class Queue{
        static int []arr;
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n ;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        // Add Element
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue Full Can't Add Element");
                return;
            }
            rear++;
            arr[rear]=data;
            return;
        }
        // Remove element
        public static int dequeue(){
            if(rear==-1){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
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
//        //Queue using collection FrameWork
//        Queue<String> myQue = new LinkedList<String>();
//        myQue.add("Batman");
//        myQue.add("Catwomen");
//        myQue.add("Joker");
//        System.out.println("My Queue is "+myQue);
//        System.out.println("Removed Item is "+myQue.remove());
//        System.out.println("My Queue is "+myQue);
//        System.out.println("Removed Item is "+myQue.element());
//        System.out.println("My Queue is "+myQue.peek());
            Queue q = new Queue(5);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.dequeue();
            }

    }
}
