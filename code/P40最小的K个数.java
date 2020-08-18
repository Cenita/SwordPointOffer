import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class P40最小的K个数 {
    public static void main(String[] args) {
        P40最小的K个数 a = new P40最小的K个数();
        for(int bn:a.getLeastNumbers(new int[]{2,4,5,6,7,1,3,2,1},2)){
            System.out.println(bn);
        }
    }
    int[] quickKSort(int[] arr, int l, int r, int k) {
        if (l >= r) return Arrays.copyOfRange(arr, 0, k);
        int i = l-1, j = r+1, pivot = arr[l+r>>1];
        while (i < j) {
            do i++; while (arr[i] < pivot);
            do j--; while (arr[j] > pivot);
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (j >= k-1) return quickKSort(arr, l, j, k);
        return quickKSort(arr, j+1, r, k);
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0) return new int[]{};
        if(k==arr.length) return arr;
        //构建大根堆,默认小根堆
        Queue<Integer> maxHeap = new PriorityQueue<>(k,(o1,o2) -> o2 - o1);
        //建立初始堆
        for(int i=0;i<k&&i<arr.length;i++)maxHeap.add(arr[i]);
        for(int i=k;i<arr.length;i++){
            //判断该元素是否比最大元素都要小
            if(arr[i]>maxHeap.peek()) continue;
            else{
                //如果该元素比最大元素要小，就把最大元素踢出去加入新元素
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.stream().mapToInt(Integer::intValue).toArray();
    }
}
