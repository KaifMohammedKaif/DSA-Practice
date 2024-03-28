public class PatternNew {
    public static void main(String[] args) {
        int size = 7;

        // Upper half of the diamond
        for (int i = 1; i <= size; i += 2) {
            for (int j = size; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = size - 2; i >= 1; i -= 2) {
            for (int j = size; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
