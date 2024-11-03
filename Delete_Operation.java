public class Delete_Operation {
    static public void DeleteElem(int arr[] , int n , int key){
        int temp =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
            temp =i;
        }
        
    }
        for(int i=temp;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+ " ");
        }
    
}
public static void main(String[] args) {
    int n=5;
    int arr[] = new int[n];
    arr[0] = 44;
    arr[1] = 77;
    arr[2] = 32;
    arr[3] = 75;
    arr[4] = 24;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println("");
   DeleteElem(arr, n, 32);
}
}