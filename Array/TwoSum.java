import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 7, 12, 15};
        int target = 14;
        int[] answer = twoSum(arr, target);
        System.out.println(Arrays.toString(answer));
    }

    static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
