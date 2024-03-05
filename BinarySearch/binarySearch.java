/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        int [] arr={2,3,5,7,12,34,56,78,90};
        // int arrs []={90,87,65,42,31,12,8,5,2};
        int tar =2;
        System.out.println(orderAgnosBS(arr, tar));
    }

    static int bs(int[]arr, int tar){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (tar>arr[mid]) {
                start = mid+1;
            } else if (tar<arr[mid]) {
                end=mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosBS(int[]arr, int tar){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid=(start+end)/2;
            if (arr[mid]==tar) {
                return mid;
            }
            if (isAsc) {
                if (tar>arr[mid]) {
                    start = mid+1;
                } else {
                    end=mid-1;
                }
            } else {
                 if (tar<arr[mid]) {
                    start = mid+1;
                } else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}