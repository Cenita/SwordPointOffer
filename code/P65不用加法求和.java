public class P65不用加法求和 {
    public static void main(String[] args) {

    }
    public int add(int a, int b) {
        while(b!=0){
            int c = (a&b)<<1;
            a = a^b;
            b = c;
        }
        return a;
    }
}
