public class P14剪绳子2 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(120));
    }
    public static int cuttingRope(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        if(n==3) return 2;
        int threeNum = n/3;
        //答案为4的情况
        if(n%3==1) threeNum-=1;
        int timeOf2 = (n-threeNum*3)/2;
        long result = 1;
        while(n>4){
            result*=3;
            result%=1000000007;
            n-=3;
        }
        if(n==4) result*=2*2;
        if(n==3) result*=3;
        if(n==2) result*=2;
        return (int)(result%=1000000007);
    }
}
