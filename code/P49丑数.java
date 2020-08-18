public class P49丑数 {
    public static void main(String[] args) {
        nthUglyNumber(10);
    }
    public static int nthUglyNumber(int n) {
        int[] dp= new int[n];
        dp[0] = 1;
        int a=0,b=0,c=0;
        for(int i=1;i<dp.length;i++){
            int r2 = dp[a]*2,r3 = dp[b]*3,r5 = dp[c]*5;
            dp[i] = Math.min(Math.min(r2,r3),r5);
            if(r2 == dp[i]) a++;
            if(r3 == dp[i]) b++;
            if(r5 == dp[i]) c++;
        }
        return dp[n-1];
    }
}
