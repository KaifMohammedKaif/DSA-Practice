public class FindInRotatedArr {
    public static void main(String[] args) {
          int [] arr= {9,11,22,45,67,89,1,2,3,5,8};
        int tar= 5;
        System.out.println(findInRotatedArr(arr, tar));
    }

    // Find target in the Rotated Sorted Array (Medium Q-33);
    static int findInRotatedArr(int [] arr, int tar){
        int pivot = Pivot(arr);
        if (tar == arr[pivot]) {
            return pivot;
        }
        if (arr[0] <= tar) {
            return bs(arr, tar, 0, pivot-1);
        }
        return bs(arr, tar, pivot+1, arr.length-1);
    }

    static int Pivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid = (start+end)/2;
            if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (mid< end && arr[mid]>arr[mid+1]) {
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
