import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={2,7,7,12,15};
        int tar = 14;
        int [] answer = twoSum(arr, tar);
        System.out.println(Arrays.toString(answer));
    }

    static int [] twoSum(int [] arr, int tar){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (tar == (arr[i]+arr[j])) {
                    return new int [] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
