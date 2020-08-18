public class P14剪绳子1 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
    public static int cuttingRope(int n) {
        //特殊情况两种
        if(n==2) return 1;
        if(n==3) return 2;
        int[] dp = new int[n+1];
        //对于子段，段2选择不剪最好，段3选择不剪最好
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            int max = i;
            for(int j=1;j<i;j++){
                if(dp[j]*dp[i-j]>max){
                    //比较最大值
                    max = dp[j]*dp[i-j];
                }
            }
            dp[i]=max;
        }
        return dp[n];
    }
}
