public class Queue_Using_Array{
  static  class Stack{
        int arr[];
        int size;
        int index;
        int front;
               Stack(int size){
            arr = new int[size];
            this.size = size;
            index = 0;
        }
        public boolean isEmpty(){
            return index == 0;
        }
        public boolean isFull(){
            return index == size;
        }
        public void enqueue(int data){
            if(isFull()){
                System.out.println("Queue Is Full");
                return;

            }
            arr[index]  = data;
            index++;
            front = arr[0];
        }
        public int dequeue(){
          
            if(isEmpty()){
                System.out.println("List is Empty");
            }
          
            int front_value = arr[0];
                for(int i=0;i<index;i++){
                    arr[i] = arr[i+1];
                }
                index--;
          
            
            
            return front_value;

        }
        public int peek(){
            return arr[0];
        }
        public void display(){
for(int i=0;i<index;i++){
    System.out.println(arr[i] );
}
        }
    }
    public static void main(String[] args) {
        Stack sc = new Stack(5);
        sc.enqueue(11);  // 11 88 1 2 
        sc.enqueue(88);
        sc.enqueue(1);
        sc.enqueue(2);
        sc.display();
        System.out.println("Front " + sc.peek());
        System.out.println("After Dequeue");
        sc.dequeue();
        sc.display();

    }
}