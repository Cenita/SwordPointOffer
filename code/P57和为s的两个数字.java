public class P57和为s的两个数字 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(nums[left]+nums[right]!=target){
            int result = nums[left]+nums[right];
            if(result>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{nums[left],nums[right]};
    }
}
