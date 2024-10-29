// Insert at any index
public class Insert_value_At_Any_position {
    static  public void insert_At_Position(int arr[] , int n , int position , int key){
for(int i=n-1;i>=position;i--){
    arr[i+1] = arr[i];
}
arr[position] = key;
    }

    public static void main(String[] args) {
        int n=5;
        int key = 99;
        int position = 2;
        int arr[] = new int[20];
        arr[0] = 18;
        arr[1] = 8;
        arr[2] = 98;
        arr[3] = 68;
        arr[4] = 78;
        System.out.println(" \n BEFORE INSERTION ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
       
     insert_At_Position(arr, n, position, key);
     n+=1;
     System.out.println(" \n BEFORE INSERTION ");
     for(int i=0;i<n;i++){
         System.out.print(arr[i] +" ");
     }
    }
}
