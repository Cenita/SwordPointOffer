import java.util.Arrays;

public class P45把数组排成最小的数 {
    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{3,30,34,5,9}));
    }
    public static String minNumber(int[] nums) {
        String[] t = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(t,(o1, o2) -> {
            return (o1+o2).compareTo(o2+o1);
        });
        StringBuilder sb = new StringBuilder();
        for(String a:t){
            if(a=="0") continue;
            sb.append(a);
        }
        return sb.toString();
    }
}
