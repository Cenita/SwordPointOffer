public class P60n个骰子的个数 {
    public static void main(String[] args) {
        P60n个骰子的个数 a = new P60n个骰子的个数();
        a.twoSum(2);
    }
    public double[] twoSum(int n) {
        double[] dp = new double[n*5+1];
        for (int i = 0; i < 6; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = dp.length-1; j >= 0 ; j--) {
                for (int k = 1; k < 6; k++) {
                    if(j-k>=0){
                        dp[j]+=dp[j-k];
                    }
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i] = dp[i]/(Math.pow(6,n));
        }
        return dp;
    }
}
