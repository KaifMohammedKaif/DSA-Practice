import java.util.Arrays;

/**
 * FirstAndLast
 */
public class FirstAndLast {

    public static void main(String[] args) {
        int []arr = {2,4,6,6,6,6,6,6,6,7,7,7,7,7,13,45,67,89,92};
        int tar=7;
        int[] ans = findFirstAndLast(arr, tar);
        System.out.println(Arrays.toString(ans));
    }

    static int [] findFirstAndLast(int []arr, int tar){
       int [] ans ={-1,-1};
       int first = searchIndex(arr, tar, true);
       int last = searchIndex(arr, tar, false);
       ans[0]=first;
       ans[1]=last;
       return ans;
    }

    static int searchIndex(int []arr,int tar, boolean isSearchStart){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end) {
            int mid= start +(end-start)/2;
            if (tar>arr[mid]) {
                start=mid+1;
            } else if (tar<arr[mid]) {
                end =mid-1;
            }else{
                ans = mid;
                if (isSearchStart) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } 
        }
        return ans;
    }
}
