public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(2010002, 0));
    }

    // Count the number of zero in n
    static int countZero(int n, int count){
        if (n==0) {
            return count;
        }
        if (n%10 == 0) {
            count++;
        }
        return countZero(n/10, count);
    }
}
