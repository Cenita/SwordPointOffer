public class P47礼物的最大价值 {
    public static void main(String[] args) {

    }
    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int x=i+1,y=j+1;
                if(dp[x-1][y]>dp[x][y-1]){
                    dp[x][y] = grid[i][j]+dp[x-1][y];
                }else{
                    dp[x][y] = grid[i][j]+dp[x][y-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
