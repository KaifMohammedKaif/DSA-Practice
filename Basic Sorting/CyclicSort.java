public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cyclicSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
