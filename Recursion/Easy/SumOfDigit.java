public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(digitSum(1356));
    }

    // Sum of digits of a number
    static int digitSum(int n){
        if (n==0) {
            return 0;
        }
        return (n%10)+digitSum(n/10);
    }
}
