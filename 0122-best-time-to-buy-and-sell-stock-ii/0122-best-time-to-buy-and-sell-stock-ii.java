
class Solution {
    // T:O(2^n), S:O(1)
    // public int maxProfit(int[] prices) {
    //     return solve(0, 1, prices);
    // }

    // private int solve(int index, int canBuy, int[] prices) {
    //     if (index == prices.length) {
    //         return 0;
    //     }

    //     if (canBuy == 1) {
    //         // Buy the stock
    //         int buy = -prices[index]
    //                 + solve(index + 1, 0, prices);

    //         // Skip buying
    //         int skip = solve(index + 1, 1, prices);

    //         return Math.max(buy, skip);
    //     } else {
    //         // Sell the stock
    //         int sell = prices[index]
    //                 + solve(index + 1, 1, prices);

    //         // Continue holding
    //         int hold = solve(index + 1, 0, prices);

    //         return Math.max(sell, hold);
    //     }

    // Optimal T:O(n), S:O(1)
      public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;

    }
}
