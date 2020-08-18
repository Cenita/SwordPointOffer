import java.util.PriorityQueue;
import java.util.Queue;

public class P41数据流中的中位数 {
    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(1);
        System.out.println(m.findMedian());
        m.addNum(2);
        System.out.println(m.findMedian());
        m.addNum(3);
        System.out.println(m.findMedian());
    }

}
class MedianFinder {
    private Queue<Integer> minHeap;
    private Queue<Integer> maxHeap;
    int count = 0;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
    }

    public void addNum(int num) {
        count++;
        if((count&1)==0){
            //是偶数则加入最小堆
            if(num<maxHeap.peek()){
                //当加入的数比最大堆的最大值还要小的时候
                //则把最大堆的最大值放入最小堆
                //将新值插入到最大堆中去
                minHeap.add(maxHeap.poll());
                maxHeap.add(num);
            }else{
                minHeap.add(num);
            }
        }else{
            //是奇数则加入最大堆
            if(!minHeap.isEmpty()&&num>minHeap.peek()){
                //当加入的比最小堆的最小值还要大的时候
                //则把最小堆的最小值插入到最大堆中去
                //将新值插入到最小堆中
                maxHeap.add(minHeap.poll());
                minHeap.add(num);
            }else maxHeap.add(num);

        }
    }

    public double findMedian() {
        if(count==0) return 0;
        if((count&1)==1) return maxHeap.peek();
        else return ((double)maxHeap.peek()+(double)minHeap.peek())/2;
    }
}
