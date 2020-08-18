public class P21调整数组顺序 {
    public static void main(String[] args) {
        exchange(new int[]{1,3,5});
    }
    public static int[] exchange(int[] nums) {
        int p1=0,p2=nums.length-1;
        while(p1<p2){
            while(p1<p2&&leftSwep(nums[p1])) p1++;
            while(p1<p2&&!leftSwep(nums[p2])) p2--;
            if(p1>p2) break;
            swep(nums,p1,p2);
        }
        return nums;
    }
    public static boolean leftSwep(int a){
        if((a&1)>0) return true;
        return false;
    }
    public static void swep(int[] nums ,int p1,int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
