public class FindInInfinteArr {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,9,13,23,45,67,78,89,93,192};
        int tar =93;
        System.out.println(ans(arr, tar));
    }

    // Find tar in infinite Array;
    static int ans(int []arr, int tar){
        int start=0;
        int end=1;
        while (tar>arr[end]) {
            int newStart = end+1;
            end= end + (end-start+1) * 2;
            start = newStart;
        }
        return bs(arr, tar, start, end);
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
