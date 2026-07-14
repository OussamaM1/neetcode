class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minB = prices[0];
        for(int sell : prices) {
            ans = Math.max(ans, sell - minB);
            minB = Math.min(minB, sell);
        }
        return ans;
    }
}
