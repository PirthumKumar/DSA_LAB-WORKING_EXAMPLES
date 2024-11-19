

public class Queue_Using_LinkedList {
  static  class Node {
        int data;
       Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class  stack{

        Node front;
        Node rear;
public boolean isEmpty(){
return front == null;
}
        public void push(int data){
            Node newNode = new Node(data);
if(isEmpty()){
   front = newNode;
   rear = newNode;
   return;
}

Node currNode = front;
while(currNode.next != null){
    currNode = currNode.next;
    rear = currNode;
}
currNode.next = newNode;
rear = newNode;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            int front_value = front.data;
            front = front.next;
            return front_value;
        }
        public int peek(){
          
            return front.data;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return;
            }
            Node currNode = front;
            while(currNode != null){
               System.out.println(" "+  currNode.data);
               currNode = currNode.next;
            }
        }
    }
    public static void main(String[] args) {
        stack sc_LinkedList = new  stack();
        sc_LinkedList.push(44); // 44 71 96 11 99 
        sc_LinkedList.push(71);
        sc_LinkedList.push(69);
        sc_LinkedList.push(11);
        sc_LinkedList.push(99);
  sc_LinkedList.display();
  System.out.println("Front Value" +  sc_LinkedList.peek());
  System.out.println("After PoP");
  sc_LinkedList.pop();
  sc_LinkedList.display();
   }

    }

