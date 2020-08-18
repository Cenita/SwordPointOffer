public class P10菲波那切数列 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        int fb[] = {0,1,1};
        if(n<=2){
            return fb[n];
        }
        for(int i=3;i<=n;i++){
            fb[0]=fb[1]%1000000007;
            fb[1]=fb[2]%1000000007;
            fb[2]=fb[0]+fb[1];
        }
        return fb[2]%1000000007;
    }
}
