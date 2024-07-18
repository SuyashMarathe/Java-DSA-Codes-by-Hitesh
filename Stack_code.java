//import java.util.Stack;
public class Stack_code {
    static class Node{
        int data;
        Node next;
         public Node(int data){
             this.data=data;
             next = null;
         }
    }

    public static class Stack{
       private static Node head ;
       public static boolean isEmpty(){
           return head == null;

       }
        public static void push(int data){
           Node new_node = new Node(data);
            if (isEmpty()) {
            head = new_node;
            return;
            }
            new_node.next=head;
            head = new_node;
        }
        public static int pop(){
           if(isEmpty()){
               return -1;
           }
           int top = head.data;
           head= head.next;
           return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        // Stack using build in library -->
//    Stack<String> stack = new Stack<>();
//        System.out.println(stack.isEmpty());
//        stack.push("Batman");
//        stack.push("Ironman");
//        stack.push("Joker");
//        System.out.println("My Stack is "+stack);
//        stack.pop();
//        System.out.println("My Stack is "+stack);
//        System.out.println("Found at "+stack.search("Ironman"));

        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
