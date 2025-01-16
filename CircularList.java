public class CircularList{
    Node head;
    static class Node{
        int key;
        Node next;
        public Node(int key){
            this.key = key;
        }
    }
    public void printlist(){
        Node currentNode = head;
        if(head == null){
            System.out.println("List Not Found");
        }
       do { 
           System.out.println(currentNode.key);
           currentNode = currentNode.next;
       } while (currentNode !=head);
    }
    public void insertatHead(int data){
        if(head==null){
            System.out.println("Empty Linked List ");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = null;
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
    }
    public void insertAfter(Node prev_node , int new_data){
        if(head==null){
            System.out.println("Empty Linked List ");
        }
        else{
            Node new_node = new Node(new_data);
            new_node.next= prev_node.next;
            prev_node.next = new_node;
        }
    }
    public void insertEnd(int new_data){
        if(head==null){
            System.out.println("Empty Linked List ");
        }
        else{
            Node newNode =  new Node(new_data);
            Node current = head;
            while(current.next!=head){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    public void deletestart(){
        if(head==null){
            System.out.println("Empty Linked List ");
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = null;
            head = head.next;
            temp.next = head;
        } 
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("Empty Linked List ");
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                if(temp.next!=head){
                    temp.next = head;
                }
                temp = temp.next;
            }
        }
    }
    public void deletePosition(int index){
        if(index == 1){
            deletestart();
            return;
        }

        Node curr = head;
        for(int i=1;i<index-1;i++){
curr = curr.next;
        }
        curr.next = curr.next.next;
    }



    public static void main(String[] args) {
        CircularList clist = new CircularList();
        clist.head = new Node(2);
        Node secNode = new Node(6);
        Node third = new Node(9);
        clist.head.next = secNode;
        secNode.next = third;
        third.next = clist.head;
        clist.insertAfter(secNode, 12);
        clist.insertatHead(26);
        clist.insertEnd(19);

        // clist.deleteEnd();
        // clist.deletestart();
        clist.deletePosition(4);  //26  2 6 12  9  19 
         clist.printlist();
        
    }
}