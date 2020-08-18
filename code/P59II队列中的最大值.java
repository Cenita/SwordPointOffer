import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P59II队列中的最大值 {
    public static void main(String[] args) {
        MaxQueue m = new MaxQueue();
        m.push_back(2);
        m.push_back(3);
        m.push_back(2);
        System.out.println(m.max_value());
        System.out.println(m.pop_front());
        System.out.println(m.pop_front());
        System.out.println(m.max_value());
    }
}
class MaxQueue {
    private Deque<Integer> deque = new LinkedList<>();
    private Queue<Integer> queue = new LinkedList<>();
    public int max_value() {
        if(!deque.isEmpty())
            return deque.peek();
        else return -1;
    }
    public void push_back(int value) {
        queue.offer(value);
        //如果加入的值比最大值要大
        if(!deque.isEmpty()&&deque.peek()<value){
            deque.clear();
            deque.offer(value);
        }else{
            //最后的比当前值还要大则加入
            while(!deque.isEmpty()&&deque.getLast()<value){
                deque.removeLast();
            }
            deque.addLast(value);
        }
    }

    public int pop_front() {
         if(queue.isEmpty()) return -1;
        int val = queue.poll();
        if(val==deque.peek()){
            deque.poll();
        }
        return val;
    }
}
