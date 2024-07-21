// This is Implementation of Queue using LinkedList [ Time Complexity - O(1) ]
public class MyQueueLinkedListExample {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{

        static Node head =  null ;
        static Node tail = null ;

        public static boolean isEmpty(){

            return head==null&&tail==null;
        }
        // Add Element
        public static void enqueue(int data){
            Node newNode = new Node(data);
            //if first element is added
            if(tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // Remove element
        public static int dequeue(){
            //when no element in the queue
            if(tail==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            //when only one element in the queue
            if(head==tail){
               tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
        //Peek
        public static int peek(){
            if(tail==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}
