/**
 * Duplicate
 */
public class Duplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(isDuplicate(arr));
    }

    static boolean isDuplicate(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}