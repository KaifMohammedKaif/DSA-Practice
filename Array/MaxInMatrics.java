
public class MaxInMatrics {
    public static void main(String[] args) {
        int [][] arr ={
            {3,5,23,2,65},
            {45,78,8},
            {67,75,9,42}
        };
        System.out.println(finds(arr));
    }

    static int finds(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
