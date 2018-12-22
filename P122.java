package problem;

public class P122 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        new P122().maxProfit(prices);
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                result += prices[i + 1] - prices[i];
            }
        }
        return result;
    }
}
