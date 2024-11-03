
import java.util.Scanner;

public class Array_Edit_Value {
   public static void main(String[] args) {
    int arr[] = {20,48,60,80};
Scanner ask = new Scanner(System.in);
System.out.println("Before Edit ");
for(int i:arr){
    System.out.print(i+" ");
}
System.out.println("\nEnter Index Number which you want Edit or Update value : ");
int index_value = ask.nextInt();
System.out.println("Enter Updated Value : ");
int Edit_value = ask.nextInt();
if(index_value< arr.length-1){
    arr[index_value] = Edit_value;
    System.out.println("After Update");
    for(int i:arr){
    System.out.print(i+" ");
}
}
else{
    System.out.println("INDEX NOT FOUND");
}
   } 
}
