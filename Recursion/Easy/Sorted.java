public class Sorted {
    public static boolean isSorted(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        
        return arr[0] <= arr[1] && isSorted(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
