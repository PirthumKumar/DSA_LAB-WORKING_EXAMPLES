// Insert at any last
public class Insert_At_Last {
    static  public int insert_End(int arr[] , int  n , int capacity , int key){
        if(n>=20){
            return n;
        }
        arr[n] = key;
        return(n+1);
    }
    public static void main(String[] args) {
        int capacity = 20;
        int n=6;
        int key =99;
        int arr[] = new int[capacity];
        arr[0] = 18 ; 
        arr[1] = 21 ;
        arr[2] = 37 ;
        arr[3] = 9 ;
        arr[4] = 11 ; 
        arr[5] = 22 ;
        System.out.println(" \n BEFORE INSERTION ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        n= insert_End(arr, n, capacity, key);
        System.out.println(" \n AFTER INSERTION ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        

    }
        
    }

