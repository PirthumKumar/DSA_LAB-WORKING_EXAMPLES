//Search any element in array
public class Search_Array {
    static public  int search_element(int arr[] , int n , int key){
        for(int i=0;i<n;i++){
            if(arr[i] ==key){
                return i;
            }

        }
        return  -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int key = 100;
        int arr[] = new int[n];
        arr[0] = 40;
        arr[1] = 30;
        arr[2] = 50;
        arr[3] = 20;
        arr[4] = 100;
        int check_element = search_element(arr , n , key);
        if(check_element == -1){
            System.out.println("ELEMENT NOT FOUND");
        }
        else 
        System.out.println("ELEMENT FOUND At  POSITION : " + (check_element+1) + "\n AND AT INDEX : "+ check_element );
    }
}
