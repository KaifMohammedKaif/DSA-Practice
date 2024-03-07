public class patterns {

    static void pattern(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern31();
    }

    static void pattern31(){
        int n=5;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int fn =34;
                System.out.print(fn);
            }
            System.out.println();
        }
    }

    static void pattern30(){
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern28(){
        int n=5;
        for (int i = 0; i < 2*n; i++) {
            int fn = i > n ? 2*n-i : i;
            int s = n-fn;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < fn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*n-2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n=5;
        for (int i = 0; i < 2*n; i++) {
            int fn = i > n ? 2*n-i : i;
            for (int j = 0; j < fn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
