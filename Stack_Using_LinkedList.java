public class Stack_Using_LinkedList{
  static  class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    static class Stack{
        Node top;
        public boolean isEmpty(){
            return top == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
if(isEmpty()){
    top = newNode;
    return;
}
newNode.next =  top;
top = newNode;

        }
        public int pop(){
            if(isEmpty()){
System.out.println("Stack is Empty");

            }
            int top_data = top.data;
             top = top.next;
             return  top_data;
        }
        public int peek(){
return top.data;

        }
        public void display(){
            if(isEmpty()){
                System.out.println("List is Empty");
            }
            Node curNode = top;
            while(curNode != null){
                System.out.println(" " +  curNode.data );
                curNode = curNode.next;
            }
        }

    }
public static void main(String[] args) {
     Stack sc_list = new Stack();
     sc_list.push(22);
     sc_list.push(11);
     sc_list.push(6);
     sc_list.push(2);   // 22 11 6 2  peek = 2
     sc_list.display();
     System.out.println("Top  : " + sc_list.peek());
     sc_list.pop();
     sc_list.pop();
     sc_list.display();
    
} 

}