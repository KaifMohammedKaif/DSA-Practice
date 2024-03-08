public class RevNum {
    public static void main(String[] args) {
        revNum(12345);
        System.out.println();
    }

    // Reverse the number
    static void revNum(int n){
        if (n==0) {
            return;
        }
        System.out.print(n%10);
        revNum(n/10);
    } 
}
