
import java.util.HashMap;

public class P03数组中重复的数字 {
    public static void main(String[] args) {
        int a[] = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(a));
    }
    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int a:nums){
            if(map.get(a)!=null){
                return a;
            }
            map.put(a,1);
        }
        return 0;
    }
}
