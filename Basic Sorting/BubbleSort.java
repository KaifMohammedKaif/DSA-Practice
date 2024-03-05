import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {78,3,64,213,4,3,56,4,59};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
        boolean isSwapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}