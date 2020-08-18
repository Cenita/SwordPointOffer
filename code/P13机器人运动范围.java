public class P13机器人运动范围 {
    public static void main(String[] args) {
        System.out.println(movingCount(38,15,9));
    }
    public static int movingCount(int m, int n, int k) {
        boolean[][] isVisited = new boolean[m][n];
        return dfs(k,isVisited,0,0);
    }
    public static int dfs(int k,boolean[][] isVisited,int x,int y){
        if(x<0||y<0||x>=isVisited.length||y>=isVisited[0].length||isVisited[x][y]==true|| (x/10 + x%10 + y/10 + y%10) > k) return 0;
        isVisited[x][y] = true;
        int res = 1
                +dfs(k,isVisited,x+1,y)
                +dfs(k,isVisited,x,y+1)
                +dfs(k,isVisited,x-1,y)
                +dfs(k,isVisited,x,y-1);
        return res;
    }
}
