public class P62圆圈中最后剩下的数字 {
    public static void main(String[] args) {

    }
    public int lastRemaining(int n, int m) {
        if(n==1) return 0;
        return (lastRemaining(n-1,m)+m)%n;
    }
}
