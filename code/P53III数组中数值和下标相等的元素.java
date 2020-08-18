public class P53III数组中数值和下标相等的元素 {
    public static void main(String[] args) {
        System.out.println(findIndexEqualsVal(new int[]{-3,-1,1,3,5}));;
    }
    public static int findIndexEqualsVal(int[] nums){
        return binarySearch(nums,0,nums.length-1);
    }
    public static int binarySearch(int[] nums,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)>>1;
        if(nums[mid]==mid) return mid;
        if(nums[mid]<mid){
            return binarySearch(nums,mid+1,end);
        }else{
            return binarySearch(nums,start,mid-1);
        }
    }
}
