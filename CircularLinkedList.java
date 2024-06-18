public class CircularLinkedList {
    static class Node{
        int data ;
        Node next ;
    };

    static Node push(Node head_ref,int data){
        Node tmp = head_ref;
        Node new_node= new Node();
        new_node.data = data;
        new_node.next = head_ref;

        if(head_ref != null){
            while(tmp.next != head_ref){
            tmp=tmp.next;
        }
            tmp.next=new_node;
    }
        else{
            new_node.next=new_node;
        }
        head_ref = new_node;
        return new_node;
 }

 static Node deleteNode(Node head,int val){
        //Case 1
     if(head == null) return null;
     Node curr = head,prev = null;
     while(curr.data != val){
         if(curr.next == head){
             System.out.println("Iteration complete");
             break;
         }
         prev=curr;
         curr=curr.next;
     }
     //if node is the only node and we want to delete that. We want to delete head
     if(curr.next==head){
         head=null;
         return head;
     }
     //if there are more nodes and we want to delete head(Head is equal to val)
     if(curr==head){
         prev=head;
         while(prev.next!=head){
             prev=prev.next;
         }
         head=curr.next;
         prev.next=head;
     }

     //If node is the last node
     else if (curr.next==head) {
         prev.next=head;
     }
     else{
         prev.next=curr.next;
     }
    return head;
 }

 static int countNumber(Node head){
    Node temp = head;
    int count = 0;

    if(head != null){
        do{
            temp = temp.next;
            count++;
        }
        while(temp != head);
    }
    return count;
 }
 static void printList(Node head){
    Node temp = head ;

    if (head!=null){
        do{
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        while(temp!=head);
    }

 }

    public static void main(String[] args) {
        Node head = null;
        head = push(head,33);
        head = push(head,20);
        head = push(head,17);
        printList(head);
    }
}
