public class Rotated {
    public static void main(String[] args) {
        int [] arr = {1,3};
        int tar = 3;
        System.out.println(findRotated(arr,tar));
    }

    static int findRotated(int [] arr, int tar){
        int pivot = pivot(arr);
        if (pivot==-1) {
            return bs(arr, tar, 0, arr.length-1);
        }
        if (arr[pivot]==tar) {
            return pivot;
        }
        if (arr[0]>tar) {
           return bs(arr, tar, pivot+1,arr.length-1);
        } else {
            return bs(arr, tar, 0, pivot);
        }
    }

    static int pivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = (start+end)/2;
            if (start < mid && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if (mid < end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (arr[mid]<=arr[start]) {
                end=mid-1;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    static int bs(int[]arr, int tar, int start, int end){
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
}
