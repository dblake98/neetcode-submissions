class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];

        for (int price : prices){
            buyPrice = Math.min(price, buyPrice);
            profit = Math.max(profit, price - buyPrice); 
        }

        return profit;
    }
}
