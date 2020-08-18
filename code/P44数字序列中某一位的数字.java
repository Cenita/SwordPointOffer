public class P44数字序列中某一位的数字 {
    public static void main(String[] args) {
        System.out.println(findNthDigit(1000000000));
    }
    public static int findNthDigit(int n) {
        if(n<=9) return n;
        int diget = 1;
        long _n = n;
        while(_n>getDiget(diget)){
            _n-=getDiget(diget);
            diget++;
        }
        long num = digetPow(diget)+(_n-1)/diget;
        int wei = String.valueOf(num).charAt(((int)_n-1)%diget)-'0';
        return wei;
    }
    public static long getDiget(int n){
        return 9*(long)Math.pow(10,n-1)*n;
    }
    public static long digetPow(int diget){
        return (long)Math.pow(10,diget-1);
    }
}
