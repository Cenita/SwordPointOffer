public class P53II0到N中缺失的数字 {
    public static void main(String[] args) {
        P53II0到N中缺失的数字 a = new P53II0到N中缺失的数字();
        a.missingNumber(new int[]{1,2});
    }
    public int missingNumber(int[] nums) {
        return binarySearch(nums,0,nums.length-1);
    }
    public int binarySearch(int[] nums,int left,int right){
        if(left>=right){
            if(nums[left]==left) return nums[left]+1;
            else return nums[left]-1;
        }
        int mid = (left+right)>>1;
        if(nums[mid]!=mid){
            return binarySearch(nums,left,mid-1);
        }else{
            return binarySearch(nums,mid+1,right);
        }
    }
}
