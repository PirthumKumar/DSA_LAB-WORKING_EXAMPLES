
import java.util.Scanner;

public class TextEditor{
    Node head;
    Node tail;
    int size = 0;
    class Node{
        String text;
        Node next; 
        Node prev;
        Node(String text){
            this.text = text;
        }
    }
    public boolean isempty(){
        return head == null;
    }
    public void addAtLast(String text){
        Node newNode = new Node(text);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void deleteNode(int Number) {
        if (isempty()) {
            System.out.println("List is Not Found");
            return;
        }
    
        Node current = head;
        if (Number == 1) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null; 
            }
            return;
        }

        for (int i = 1; i < Number && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }
    
    public void display(){
        int count =0;
        if(isempty()){
            System.out.println("List is Not Found ");
        }
        Node curNode = head;
        while(curNode != null){
System.out.println (++count+". " +curNode.text);
curNode = curNode.next;
        }
    }
    public void updatetext(String Text, int Number) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
  
        if (Number == 1) {
            head.text = Text;
            return;
        }
    
        Node currNode = head;

        for (int i = 1; i < Number; i++) {
            if (currNode.next == null) {
                System.out.println("Invalid position: Number exceeds the list length.");
                return;
            }
            currNode = currNode.next;
        }

        currNode.text = Text;
    }
    
    
    public static void main(String[] args) {
         TextEditor txt = new TextEditor();
        Scanner ask = new Scanner(System.in);
       
        while (true) {
            System.out.println("1. Add Text \n2. Delete Text \n3. Update Text \n4. Display Text\n5. Exit");
            int number = ask.nextInt();
            ask.nextLine();
            switch (number) {
                case 1:
                System.out.println("Enter Text : --> ");
                String text = ask.nextLine();
                    txt.addAtLast(text);
                    break;
                    case 2:
                    System.out.println("Enter Text Number  : --> ");
                int del = ask.nextInt();
                    txt.deleteNode(del);
                    break;
                    case 3:
                    System.out.println("Enter Text Number For Updation  : --> ");
                int upnumber = ask.nextInt();
                ask.nextLine();
                System.out.println("Enter Updated Text  : --> ");
                String uptext = ask.nextLine();
                txt.updatetext(uptext, upnumber);
                    break;
                    case 4:
                    txt.display();
                    break;
                    case 5:
                    System.out.println("Thankyou!!");
                    return;
            }
        }
    }
}