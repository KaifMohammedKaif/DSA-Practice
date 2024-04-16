public class GCD {
    // Find GCD.
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        System.out.println(findGCD(num1, num2));
    }
