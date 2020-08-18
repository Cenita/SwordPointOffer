import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class P59I滑动窗口最大值 {
    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,1,2,0,5},3);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0) return new int[]{};
        //维护一个单调递减序列
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i-k;
            //删除头部元素
            if(j>=0&&deque.peek()==j){
                deque.poll();
            }
            //如果元素最大值都比加入的要小，则清除队列，加入最大值
            if(!deque.isEmpty()&&nums[deque.peek()]<nums[i]){
                deque.clear();
                deque.offer(i);
            }else{
                //保持单调递减
                while(!deque.isEmpty()&&nums[deque.getLast()]<nums[i]){
                    deque.removeLast();
                }
                //增加元素
                deque.addLast(i);
            }
            if(j+1>=0){
                res[index++] = nums[deque.peek()];
            }
        }
        return res;
    }
}
