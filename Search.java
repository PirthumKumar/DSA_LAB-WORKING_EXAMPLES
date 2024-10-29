class Search{
    static int findElement_Position(int arr[] , int n  , int key){
        for(int i=0 ; i<n;i++){
            if(arr[i] == key){
                return i;
            }
           
        }
         return -1;
    }
    public static void main(String[] args){
    int n=5;
       int arr[] = {2 ,4 , 5 , 6 , 8};
       int key = 5;
int Position =  findElement_Position(arr , n  , key);
if(Position == -1){
    System.out.println("NOT FOUND");
}
else {
       System.out.println(Position+1);
}
    
}
}