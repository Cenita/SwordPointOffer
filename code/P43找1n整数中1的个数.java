public class P43找1n整数中1的个数 {
    public static void main(String[] args) {
        System.out.println(countDigitOne(100));
    }
    public static int countDigitOne(int n) {
        int diget = 1;
        int count = 0;
        int low = 0;
        while(n!=0){
            int cur = n%10;
            if(cur==0){
                count+=(n/10)*diget;
            }else if(cur==1) {
                count += (n /10) * diget + low + 1;
            }else{
                count+=((n)/10+1)*diget;
            }
            low+=n%10*diget;
            diget*=10;
            n/=10;
        }
        return count;
    }
}
