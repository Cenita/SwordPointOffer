public class P56II数组中数字出现的次数 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,4,3,3}));
    }
    public static int singleNumber(int[] nums) {
        int[] w = new int[32];
        for(int a:nums){
            int _a = a;
            int index = 0;
            while(_a!=0){
                //if((_a&1)==1) w[index]=(++w[index]); 尽量减少判断直接上 能少10ms
                w[index]=w[index]+(_a&1);
                index+=1;
                _a=_a>>1;
            }
        }
        int result = 0;
        for (int i = w.length-1; i >= 0; i--) {
            result = result<<1;
//            if(w[i]%3==1){ 尽量减少判断直接上
//                result+=1;
//            }
            result+=((w[i]%3)&1);
        }
        return result;
    }
}
