import java.util.Arrays;

public class Bubble_Sort_String {
   static public  void sort_String(String[] arr){
      for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length-i-1;j++){
    if(arr[j].charAt(0) > arr[j+1].charAt(0) ){
        String temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
   
  }

      }
   
    }
    public static void main(String[] args) {
        String str[] = {"Pirthum" , "Apple" , "Memon", "Bhawish" ,"Ba" , "AA"};
        System.out.println(Arrays.toString(str));
        sort_String(str);
        System.out.println(Arrays.toString(str));
    }
}
