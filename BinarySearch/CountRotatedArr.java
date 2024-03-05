/**
 * CountRotatedArr
 */
public class CountRotatedArr {

    public static void main(String[] args) {
        int [] arr = {15,18,34,45,1,2};
        System.out.println(countRotation(arr));
    }

    // Count the no. of Rotation in Sorted Array;
    static int countRotation(int [] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    static int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid =(start+end)/2;
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }

            if (arr[mid]<=arr[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }

}