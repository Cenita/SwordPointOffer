public class P56数组中数字出现的次数 {
    public static void main(String[] args) {

    }
    public int[] singleNumbers(int[] nums) {
        int state = 0;
        for(int a:nums){
            state^=a;
        }
        int count = 0;
        int _state = state;
        while((_state&1)!=1){
            count++;
            _state = _state>>1;
        }
        int[] result = new int[2];
        result[0] = state;
        result[1] = state;
        for(int a:nums){
            int b = a;
            for (int i = 0; i < count; i++) {
                b=b>>1;
            }
            if((b&1)==1){
                result[0]^=a;
            }else{
                result[1]^=a;
            }
        }
        return result;
    }
}
