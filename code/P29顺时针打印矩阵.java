public class P29顺时针打印矩阵 {
    public static void main(String[] args) {
        spiralOrder(new int[][]{{1,2,3},{5,6,7},{9,10,11}});
    }
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new int[]{};
        int result[] = new int[matrix.length*matrix[0].length];
        boolean map[][] = new boolean[matrix.length][matrix[0].length];
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int index=0,dirIndex=0,x=0,y=-1;
        while(index<result.length){
            if(x+dir[dirIndex][0]<0||x+dir[dirIndex][0]>=matrix.length
               ||y+dir[dirIndex][1]<0||y+dir[dirIndex][1]>=matrix[0].length){
                dirIndex=(dirIndex+1)%dir.length;
                continue;
            }
            if(map[x+dir[dirIndex][0]][y+dir[dirIndex][1]]==true){
                dirIndex=(dirIndex+1)%dir.length;
                continue;
            }
            x+=dir[dirIndex][0];
            y+=dir[dirIndex][1];
            result[index++]=matrix[x][y];
            map[x][y]=true;
        }
        return result;
    }
}
