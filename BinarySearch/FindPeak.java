public class FindPeak {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,15,21,12,8,7,6,5,3,1};
        int tar= 5;
        System.out.println(findInPeak(arr, tar));
        // System.out.println(findPeak(arr));
    }

    // Find the Peak of Mountain Array (Easy & Medium Q-852 and 162);
    static int findPeak(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid = (start+end)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    // Find target in the Peak Mountain (Hard Q-1095);
    static int findInPeak(int [] arr, int tar){
        int peak = Peak(arr);
        int firstHalf = orderAgnosBS(arr, tar, 0, peak);
        if (firstHalf == -1) {
            return orderAgnosBS(arr, tar, peak, arr.length-1);
        }
        return firstHalf;
    }

    static int Peak(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid = (start+end)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }

    static int orderAgnosBS(int[]arr, int tar, int start, int end){
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
