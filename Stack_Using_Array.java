

public class Stack_Using_Array {
   static class Stack{
        int arr[];
        int size;
        int index;
        Stack(int size){
            arr = new int[size];
            this.size = size;
            index =0;
        }
        public boolean  isEmpty(){
            return index == 0;
        }
        public boolean isFull(){
            return this.index  ==  size ;
        }
        public void push(int data){
            if(isFull()){
                System.out.println("Stack is Full");
            }
            arr[this.index] = data;
            this.index++; 
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack  is Empty");
            }
          
            return arr[--this.index];
        }
        public int peek(){
            return arr[index -1 ];
        }

    }
    public static void main(String[] args) {
        Stack array_sc = new Stack(5);
        array_sc.push(55); 
        array_sc.push(11);
        array_sc.push(17);
        array_sc.push(77);
        array_sc.push(7);
     
        while(!array_sc.isEmpty()){
            System.out.println(array_sc.peek());
            array_sc.pop();
        }
      

    }
    
}
