public class P17打印从1到最大n的位数 {
    public static void main(String[] args) {
        printMax(0);
    }
    public static void printMax(int n){
        if(n<=0) return;
        char[] nums = new char[n];
        printToMaxOfNDigits(nums,n-1);
    }
    public static void printToMaxOfNDigits(char[] nums,int index){
        if(index<0){
            printNumber(nums);
            return;
        }
        for(int i=0;i<10;i++){
            nums[index]=(char)(i+'0');
            printToMaxOfNDigits(nums,index-1);
        }
    }
    public static void printNumber(char[] nums){
        int i = nums.length-1;
        StringBuilder temp = new StringBuilder();
        boolean isHaveNumber = false;
        while(i>=0){
            if(nums[i]!='0'||isHaveNumber){
                temp.append(nums[i]);
                isHaveNumber=true;
            }
            i--;
        }
        System.out.println(temp);
    }
}
