public class P16数值的整数次方 {
    public static void main(String[] args) {
        System.out.println(myPow(1,-2147483648));
    }
    public static double myPow(double x, int n) {
        //防止0倒数异常
        if(x==0&&n<0) return 0;
        //将指数为负数和正数变成一个情况，负数单独求倒数
        long expoent = n;
        expoent = expoent<0?-expoent:expoent;
        double result = PowerWithUnsighExpoent(x,expoent);
        if(n<0){
            //负数记得求导
            result=1.0/result;
        }
        return result;
    }
    public static double PowerWithUnsighExpoent(double base,long Expoent){
        //特殊情况处理
        if(Expoent==0)return 1;
        if(Expoent==1)return base;
        //递归倍数乘，使用位移运算来除以2
        double result=PowerWithUnsighExpoent(base,Expoent>>1);
        result*=result;
        //如果是奇数的话，则乘以其本身就可分割，使用与运算来代替求余
        if((Expoent&1)==1){
            result*=base;
        }
        return result;
    }
}
