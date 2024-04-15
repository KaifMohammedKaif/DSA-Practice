public class SquareRoot {
    
    public static double squareRoot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        double left = 0;
        double right = x;
        double epsilon = 0.000001;
        
        while (right - left > epsilon) {
            double mid = left + (right - left) / 2;
            double square = mid * mid;
            
            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        return left + (right - left) / 2;
    }
    
    public static void main(String[] args) {
        int number = 16;
        double result = squareRoot(number);
        System.out.println("Square root of " + number + " is approximately " + result);
    }
                            
