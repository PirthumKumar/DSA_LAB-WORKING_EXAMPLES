
import java.util.Arrays;

public class Quick_Sort {
public static  void quick_sort(int arr[] , int low, int high){
    if(low<high){
        int pivot = partation( arr, low ,high);
        quick_sort(arr, low, pivot-1);
        quick_sort(arr, pivot+1, high);
    }
}

public static int partation(int arr[] , int low , int high){
    int pivot = arr[high];
    int i=low-1;
    for(int j=low ;j<high;j++){
        if(arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high]=temp;
    return i;
}

public static void main(String[] args) {
    int arr[] = {12,9,1,2,4,88,25};
    System.out.println(Arrays.toString(arr));
quick_sort(arr, 0, arr.length-1);
System.out.println(Arrays.toString(arr));

}
}