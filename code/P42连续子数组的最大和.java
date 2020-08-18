public class P42连续子数组的最大和 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,-2,3,10,-4,7,2,-5}));
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>0){
                nums[i]=nums[i]+nums[i-1];
            }
            max = nums[i]>max?nums[i]:max;
        }
        return max;
    }
}
