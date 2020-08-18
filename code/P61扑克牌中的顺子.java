import java.util.HashSet;

public class P61扑克牌中的顺子 {
    public static void main(String[] args) {
        P61扑克牌中的顺子 a = new P61扑克牌中的顺子();
        a.isStraight(new int[]{0,0,1,2,5});
    }
    public boolean isStraight(int[] nums) {
        boolean[] map = new boolean[14];
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) continue;
            if(map[nums[i]]) return false;
            min=min<nums[i]?min:nums[i];
            max=max>nums[i]?max:nums[i];
            map[nums[i]]=true;
        }
        return (max-min)<=4;
    }
}
