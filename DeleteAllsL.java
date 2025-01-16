public class DeleteAllsL {
    Node head;
    int length =0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public boolean isEmpty(){
        return  head ==null;
    }
    public void addLast(int data){
        length++;
Node newNode = new Node(data);
if(isEmpty()){
    head = newNode;
    return;
}
Node currNode = head;
while(currNode.next != null){
    
    currNode = currNode.next;

}
currNode.next = newNode;
newNode.next = null;

    }
    public void DeleteLast(){
        if(isEmpty()){
            System.out.println("No List");
            return;
        }
        length--;
        Node currNode = head.next;
        Node secNode = head;
        while(currNode != null){
            currNode = currNode.next;
            secNode = secNode.next;
        }
      
        secNode.next = null;
        
        
    }
    public void display(){
        if(isEmpty()){
            System.out.println("No List");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ " ");
            currNode = currNode.next;
        }
        System.out.println(" ");

    }
    public void deleteall(){
  
        head = null; 
    }
    public static void main(String[] args) {
        DeleteAllsL list = new DeleteAllsL();
        list.addLast(22);
        list.addLast(17);
        list.addLast(8);
        list.addLast(7);
        list.display();
        list.deleteall();
        list.display();
        System.out.println("List is Deleted ");
    }
    
}
