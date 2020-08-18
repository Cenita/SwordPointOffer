public class P15二进制中的1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight2(11));
    }
    public static int hammingWeight(int n) {
        int flag=1;
        //符号位
        int count=n>=0?0:1;
        while(flag!=0){
            if((flag&n)>0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }

    public static int hammingWeight2(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
