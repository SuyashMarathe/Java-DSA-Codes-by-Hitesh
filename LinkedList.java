class LinkedList{
    //Head of the List
    Node head;
     static class Node{
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

    Node linkedReversed(Node node){
         Node prev = null;
         Node next = null;
         Node curr = head;
         while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
         }
         head = prev ;
         return node;
    }

    void deleteNode(int key){
         Node temp = head ,prev=null;
         //Case 1 : Head Deletion
        if(temp!=null && temp.data==key){
            head = temp.next;
        }
        //Case 2 : Something else
        while(temp!=null && temp.data!=key){
            prev = temp;
            temp=temp.next;
        }

        //Case 3  :
        if(temp==null) return;

         prev.next=temp.next;
    }
    void deleteEntireList(){
         head = null ;
    }

    public int getNodeCount(Node node){
        if(node == null){
            return 0;
        }
        return 1 + getNodeCount(node.next);
    }

    public int getCount(){
         return getNodeCount(head);
    }

    public int countLoop(){
         int count = 0;
         Node temp = head;
         while(temp!=null){
             count ++;
             temp = temp.next;
         }
         return count;
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
