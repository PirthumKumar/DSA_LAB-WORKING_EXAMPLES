public class MiddleOfNode {
    Node head;
    int length =0;
   static  class Node{
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
    public void  MiddleOfNod(){
        Node currNode = head;
      
       if(length % 2 ==1 ){
        for(int i=0;i<length/2;i++){
            currNode = currNode.next;
        }
        System.out.println("Middle Of the List : "+currNode.data);
       }else{
        Node cuNode = head;
        for(int i=0;i<length/2-1;i++){
            cuNode = cuNode.next;

        }
        System.out.println("Middle Of the List  Are : "+cuNode.data + " & " + cuNode.next.data);

       }
    }
    public static void main(String[] args) {
        System.out.println(":- List 1 -:");
        MiddleOfNode  list = new MiddleOfNode();
        list.addLast(22);
        list.addLast(14);
        list.addLast(11);
        list.addLast(3);
        list.addLast(9);
        list.display();
        list.MiddleOfNod();
        System.out.println(":- List 2 -:");
        MiddleOfNode  list2 = new MiddleOfNode();
        list2.addLast(22);
        list2.addLast(14);
        list2.addLast(55);
        list2.addLast(27);
        list2.addLast(9);
        list2.addLast(16);
        list.addLast(11);
        list.addLast(85);
        list2.display();
        list2.MiddleOfNod();
        

    }
}
