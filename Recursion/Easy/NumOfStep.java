public class NumOfStep {
    public static void main(String[] args) {
        System.out.println(numOfStep(14));
    }

    // Count the no. of steps it will take to reduce a no. to zero  (leetcode Q-1342)
    static int numOfStep(int n){
        return helper(n, 0);
    }

    static int helper(int n, int steps){
        if (n==0) {
            return steps;
        }
        if (n%2 == 0) {
           return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
