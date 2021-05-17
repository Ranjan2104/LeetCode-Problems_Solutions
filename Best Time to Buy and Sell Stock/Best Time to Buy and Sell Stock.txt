class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max_profit = 0;
        if(prices.length == 0) return 0;
        for(int nums : prices){
            min = Math.min(min, nums);
            profit = nums - min;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
}
// Contributed by Amresh Ranjan.