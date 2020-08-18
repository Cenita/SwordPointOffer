public class P46把数字翻译成字符串 {
    public static void main(String[] args) {
        System.out.println(translateNum(25));
    }
    public static int translateNum(int num) {
        char[] cn = String.valueOf(num).toCharArray();
        int[] dp = new int[cn.length+1];
        dp[cn.length-1] = 1;
        dp[cn.length] = 1;
        for (int i = cn.length-2; i >= 0 ; i--) {
            if(cn[i]=='1'){
                dp[i] = dp[i+1] + dp[i+2];
            }else if(cn[i]=='2'){
                if(cn[i+1]<'6'){
                    dp[i] = dp[i+1] + dp[i+2];
                }else{
                    dp[i] = dp[i+1];
                }
            }else{
                dp[i] = dp[i+1];
            }
        }
        return dp[0];
    }
}

