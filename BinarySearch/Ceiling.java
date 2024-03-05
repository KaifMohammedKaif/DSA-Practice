public class Ceiling {
     public static void main(String[] args) {
        //  char [] arr={'b','c','f','h','l','m','s'};
        //  char tar='s';
        // int [] arr={2,3,5,7,12,34,56,78,90};
        // int tar=54;
        // System.out.println(ceilingBs(arr, tar));
        // System.out.println(floorBs(arr, tar));
        // System.out.println(charCeilingBs(arr, tar));
    }
    
    // find index of smallest no. greater than target
     static char charCeilingBs(char [] arr, char tar){
        
        int start=0;
        int end=arr.length-1; 
        while (start<=end) {
            int mid=start+end;
            if (tar<arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            } 
        }
        return arr[start % arr.length];
    }

    // Find the index of smallest no. greater than or equal to target
    static int ceilingBs(int [] arr, int tar){

        if (tar>arr[arr.length-1]) {
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+end;
            if (tar>arr[mid]) {
                start =mid+1;
            } else if (tar<arr[mid]) {
                end = mid-1;
            } else{
                return mid;
            }
        }
        return start;
    }

    // Find the index of greatest no. smaller than or equal to target
    static int floorBs(int [] arr, int tar){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+end;
            if (tar>arr[mid]) {
                start =mid+1;
            } else if (tar<arr[mid]) {
                end = mid-1;
            } else{
                return mid;
            }
        }
        return end;
    }
}
