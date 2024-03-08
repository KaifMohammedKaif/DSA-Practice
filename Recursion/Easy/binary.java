public class binary {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,9,12,34,56,78,89};
        int start =0;
        int end =arr.length-1;
        int tar= 2;
        System.out.println(binaryS(arr, start, end, tar));
    }
    
    // Binary Search Using Recursion
    static int binaryS(int[] arr, int start,int end, int tar){
        int mid=(start+end)/2;
        if(start>end){
            return -1;
        } else if (tar==arr[mid]) {
            return mid;
        } else if (tar>arr[mid]) {
            return binaryS(arr, mid+1, end, tar);
        } 
        return binaryS(arr, start, mid-1, tar);
    }
}
