public class MaxSubArr {
    public static void main(String[] args) {
        int[][] arr = {
            {3,9,7},
            {7,6,3},
            {9,8,1}
        };
        System.out.println(maxSub(arr));
    }

    // Find the Max sub array;
    static int maxSub(int [][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
