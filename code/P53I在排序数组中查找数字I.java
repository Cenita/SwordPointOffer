public class P53I在排序数组中查找数字I {
    public static void main(String[] args) {
        P53I在排序数组中查找数字I a = new P53I在排序数组中查找数字I();

        System.out.println(a.search(new int[]{2,2},2));
    }
    public int search(int[] nums, int target) {
        int frist = getSearchFrist(nums,target,0,nums.length-1);
        int last = getSearchLast(nums,target,0,nums.length-1);
        if(frist==-1) return 0;
        return last-frist+1;
    }
    public int getSearchFrist(int[] nums,int key,int start,int end){
        if(start>end) return -1;
        int mid = (start+end)>>1;
        if(nums[mid]==key){
            if(mid==0||nums[mid-1]!=key) return mid;
            else return getSearchFrist(nums,key,start,mid-1);
        }
        if(nums[mid]<key){
            return getSearchFrist(nums,key,mid+1,end);
        }else{
            return getSearchFrist(nums,key,start,mid-1);
        }
    }
    public int getSearchLast(int[] nums,int key,int start,int end){
        if(start>end) return -1;
        int mid = (start+end)>>1;
        if(nums[mid]==key){
            if(mid==nums.length-1||nums[mid+1]!=key) return mid;
            else return getSearchLast(nums,key,mid+1,end);
        }
        if(nums[mid]<key){
            return getSearchLast(nums,key,mid+1,end);
        }else{
            return getSearchLast(nums,key,start,mid-1);
        }
    }
}
