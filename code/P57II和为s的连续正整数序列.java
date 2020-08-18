import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P57II和为s的连续正整数序列 {
    public static void main(String[] args) {
        P57II和为s的连续正整数序列 a =new P57II和为s的连续正整数序列();
        a.findContinuousSequence(15);
    }
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int a=1,b=2;
        int count=3;
        for (;b<=target/2+1;) {
            if(count<target){
                b++;
                count+=b;
            }else if(count>target){
                count-=a;
                a++;
            }else if(count==target){
                int[] t = new int[b-a+1];
                int ta = a;
                for (int i = 0; i <= t.length-1; i++) {
                    t[i] = ta++;
                }
                result.add(t);
                b++;
                count+=b;
            }
        }
        int[][] re = new int[result.size()][];
        for (int i = 0; i < re.length; i++) {
            re[i] = result.get(i);
        }
        return re;
    }
}
