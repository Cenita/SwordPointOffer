import java.util.Arrays;

public class P51数组中的逆序对 {
    private int count = 0;
    public static void main(String[] args) {
        P51数组中的逆序对 a = new P51数组中的逆序对();
        System.out.println(a.reversePairs(new int[]{7,5,6,4}));
//        int a[] = Arrays.copyOfRange(new int[]{2,5,1,23},0,1);
//        System.out.println(a);
    }
    public int reversePairs(int[] nums) {
        if(nums.length<=1) return 0;
        count=0;
        int a[] = mergeSort(nums,0,nums.length-1);
        return count;
    }
    public int[] mergeSort(int[] nums,int start,int end){
        if(start>=end){
            int[] a = new int[1];
            a[0] = nums[start];
            return a;
        }
        int mid = (start+end)>>1;
        int a[] = mergeSort(nums,start,mid);
        int b[] = mergeSort(nums,mid+1,end);
        return merge(a,b);
    }
    public int[] merge(int[] arr1,int arr2[]){
        int[] arr = new int[arr1.length+arr2.length];
        int index=arr.length-1,a=arr1.length-1,b=arr2.length-1;
        while(a>=0&&b>=0){
            if(arr1[a]>arr2[b]){
                arr[index--] = arr1[a--];
                count+=b+1;
            }else{
                arr[index--] = arr2[b--];
            }
        }
        while(a>=0){
            arr[index--] = arr1[a--];
        }
        while(b>=0){
            arr[index--] = arr2[b--];
        }
        return arr;
    }
}
