/**
 * linear
 */
public class LinearSearch {

    public static void main(String[] args) {
        int [] arr = {45,23,6,34,56,33,59,89};
        // int tar =59;
        // int start =2;
        // int end =4;
        // System.out.println(rangeSearch( arr, tar,start,end));
        System.out.println(findMax(arr));
    }

    public static int findMax(int [] arr) {
        if (arr.length<= 0) {
            return -1;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max= arr[i];
            }
        }
        return max;
    }
    
    public static int rangeSearch(int [] arr,int tar, int start, int end) {
        if (arr.length<= 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (tar == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(int [] arr,int tar) {
        if (arr.length<= 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (tar == arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}