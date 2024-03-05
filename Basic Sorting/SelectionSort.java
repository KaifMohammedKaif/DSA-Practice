import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={3,67,-32,0,36,79};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }    

    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIdx = max(arr, 0, last);
            swap(arr, last, maxIdx);
        }
    }

    static int max(int [] arr, int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr, int last, int maxIdx){
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[last];
        arr[last] = temp;
    }
}
