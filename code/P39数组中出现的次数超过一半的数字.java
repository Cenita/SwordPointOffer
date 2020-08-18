public class P39数组中出现的次数超过一半的数字 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
    public static int majorityElement(int[] nums) {
        if(nums.length==0) return 0;
        int flagNums = nums[0];
        int count = 1;
        for(int b:nums){
            if(flagNums==b) count++;
            else{
                if(count<=1){
                    flagNums = b;
                    count = 1;
                }else{
                    count--;
                }
            }
        }
        return flagNums;
    }
}
