public class P63股票的最大利润 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.min(dp[i-1],prices[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(prices[i]-dp[i],max);
        }
        return max;
    }

}
