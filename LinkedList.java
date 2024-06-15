public class LinkedList{
    //Head of the List
    Node head;
     class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int new_value){
        Node new_node = new Node(new_value);
        new_node.next = head ;
        head = new_node;
    }

    public void insertAt(Node prev_node,int new_value){
        if (prev_node == null) {
            System.out.println("Previous Node Seems to be NULL");
            return;
        }
        Node new_node = new Node(new_value);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    public void append(int new_value){
        Node new_node = new Node(new_value);
        if(head==null){
            head=new Node(new_value);
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next = new_node;
        return;
    }

    public void printList(){
         Node myNode = head;
         while (myNode!=null){
             System.out.println(myNode.data+" ");
             myNode=myNode.next;
         }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(5);
        llist.push(10);
        llist.printList();
    }
}
