public class P12矩阵中的路径 {
    public static void main(String[] args) {
        char[][] map = {
                {'a','b'}
        };
        String path = "ba";
        System.out.println(exist(map,path));
    }
    public static boolean exist(char[][] board, String word) {
        if(board==null||board.length==0||board[0]==null||board[0].length==0||word==null||word.equals("")) return false;
        char[] chs = word.toCharArray();
        boolean[][] isVisited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(chs[0]==board[i][j]){
                    if(dfs(board,chs,isVisited,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board,char[] chs,boolean[][] isVisited,int x,int y,int index){
        if(index==chs.length) return true;
        if(x<0||y<0||x>=board.length||y>=board[0].length||isVisited[x][y]==true||board[x][y]!=chs[index]) return false;
        isVisited[x][y]=true;
        boolean res =
                dfs(board,chs,isVisited,x+1,y,index+1)
                ||dfs(board,chs,isVisited,x,y+1,index+1)
                ||dfs(board,chs,isVisited,x-1,y,index+1)
                ||dfs(board,chs,isVisited,x,y-1,index+1);
        isVisited[x][y]=false;
        return res;
    }
}
