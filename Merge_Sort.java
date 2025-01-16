
import java.util.Arrays;

public class Merge_Sort {
   static  public void Split(int arr[], int start, int end) {
        if(start>=end){
            return;
        }
        int mid = (start +end)/2;
        Split(arr, start, mid);
        Split(arr, mid+1, end);

        merge(arr, start , mid , end);

    }
    public static void merge(int arr[], int start, int mid, int end) {
        int Merger[] = new int[end-start+1];
        int l1 = start;
        int l2 = mid + 1;
        int x = 0;
    
        while (l1 <= mid && l2 <= end) {
            if (arr[l1] <= arr[l2]) {
                Merger[x] = arr[l1];
                l1++;
            } else {
                Merger[x] = arr[l2];
                l2++;
            }
            x++;
        }
    
        while (l1 <= mid) {
            Merger[x] = arr[l1];
            l1++;
            x++;
        }
    
        while (l2 <= end) {
            Merger[x] = arr[l2];
            l2++;
            x++;
        }
    
        for (int i = 0, j = start; i < Merger.length; i++, j++) {
            arr[j] = Merger[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,3,8,99,11};
        System.out.println(Arrays.toString(arr));
        Split(arr, 0, arr.length-1);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
       }
    }

}