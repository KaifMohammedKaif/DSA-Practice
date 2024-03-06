public class CountEven {
    public static void main(String[] args) {
        int [] nums ={4543,335,12,6,7896};
        System.out.println(evenNum(nums));
    }

    // count num of el in array has even num of digits;
    static int evenNum(int []nums){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] > 0) {
                nums[i]= nums[i]/10;
                digit++;
            }
            if (digit!=0) {    
                if (digit%2==0) {
                    count++;
                }
            }
        }
        return count;
    }
}
