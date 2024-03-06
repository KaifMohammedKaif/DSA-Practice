/**
 * StockProfit
 */
public class StockProfit {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(ans(arr)); 
    }

    static int ans(int [] arr){
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j] && (arr[j]-arr[i]) > profit) {
                    profit = arr[j]-arr[i];
                }
            }
        }
        return profit;
    }
}