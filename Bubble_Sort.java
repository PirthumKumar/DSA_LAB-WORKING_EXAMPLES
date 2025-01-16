
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort{

    public static int[] bubble_sort(int arr[] ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
     return arr;   
    }
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
    System.out.println("Enter Total Length Of array : ");
    int  n= ask.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Values ");
    for(int i=0;i<arr.length;i++){
        arr[i] = ask.nextInt();
    }

    System.out.println(Arrays.toString(arr));

    bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}
