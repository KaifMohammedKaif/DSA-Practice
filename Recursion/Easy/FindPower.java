public class FindPower {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = power(base, exponent);
        System.out.println(result);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
