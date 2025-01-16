public class RemoveFormSortedList {
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
    public void removeDuplicates() {
        Node current = head;
    
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
   
    public static void main(String[] args) {
        RemoveFormSortedList list = new RemoveFormSortedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(5);
        list.addLast(5);
        list.addLast(6);
        list.display();
        list.removeDuplicates();
        list.display();
    }
}
