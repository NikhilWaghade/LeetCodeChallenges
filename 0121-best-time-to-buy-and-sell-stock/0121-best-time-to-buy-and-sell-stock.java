class Solution {
    public int maxProfit(int[] prices) {
        //  Bruth Forch --> T:O(n²) , S:O(1)
        // int maxProfit = 0;

        // for(int i = 0; i < prices.length; i++) {

        //     for(int j = i + 1; j < prices.length; j++) {

        //         int profit = prices[j] - prices[i];

        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        // }

        // return maxProfit;
            

            // Optimal --> T:O(n), S:O(1)

                int minPrice = Integer.MAX_VALUE;
                int maxProfit = 0;

                for (int price : prices) {

                    if (price < minPrice) {
                        minPrice = price;
                    }

                    int profit = price - minPrice;

                    maxProfit = Math.max(maxProfit, profit);
                }

                return maxProfit;
          
    }
}