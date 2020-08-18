public class P11旋转数组最小数字 {
    public static void main(String[] args) {
        System.out.println(minArray(new int[]{2,2,2,0,1}));
    }
    public static int minArray(int[] numbers) {
        int p1 = 0;
        int p2 = numbers.length-1;
        int midP = (p1+p2)/2;
        //情况1：数组是顺序的
        if(numbers[p1]<numbers[p2]) return numbers[p1];
        //情况2：数组是1011111或者11111101的情况
        if(numbers[p1]==numbers[p2]&&numbers[p2]==numbers[midP]){
            int min = Integer.MAX_VALUE;
            for(int a:numbers){
                min = min<a?min:a;
            }
            return min;
        }
        //情况3：数组是二分查找
        while(p1<p2){
            if(numbers[midP]>numbers[p2]){
                p1 = midP==p1?++p1:midP;
            }else if(numbers[midP]<=numbers[p2]){
                p2 = midP==p2?++p2:midP;
            }
            midP = (p1+p2)/2;
        }
        return numbers[p1];
    }
}
