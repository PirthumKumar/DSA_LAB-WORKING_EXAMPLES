
public class mergeSl {

    Node head;
    int length = 0;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int data) {
        length++;
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {

            currNode = currNode.next;

        }
        currNode.next = newNode;
        newNode.next = null;

    }

    public void DeleteLast() {
        if (isEmpty()) {
            System.out.println("No List");
            return;
        }
        length--;
        Node currNode = head.next;
        Node secNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            secNode = secNode.next;
        }

        secNode.next = null;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("No List");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println(" ");

    }

    public void mergeSl(mergeSl list1, mergeSl list2) {
        Node temp = list1.head;
        Node temp1 = list2.head;
        Node newHead = null;
        Node curNode = null;
        while (temp != null && temp1 != null) {
            Node newNode = null;
            if (temp.data < temp1.data) {
                newNode = new Node(temp.data);
                temp = temp.next;

            } else if (temp1.data < temp.data) {
                newNode = new Node(temp1.data);
                temp1 = temp1.next;

            }
            if (newHead == null) {
                newHead = newNode;
            } else {
                curNode.next = newNode;
            }
            curNode = newNode;
        }
        if (temp != null) {
            curNode.next = temp;
        } else {
            curNode.next = temp1;
        }
        this.head = newHead;
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        System.out.println(":- List One -:");
        mergeSl list1 = new mergeSl();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(8);
        list1.addLast(11);
        list1.display();

        System.out.println(":- List Two-:");
        mergeSl list2 = new mergeSl();
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(7);
        list2.addLast(9);
        list2.addLast(10);
        list2.display();

        System.out.println(":- After Merge Two-:");
        mergeSl list3 = new mergeSl();
        list3.mergeSl(list1, list2);
        // list3.display();

    }
}
