public class P66构建乘积数组 {
    public static void main(String[] args) {
        P66构建乘积数组 a = new P66构建乘积数组();
        a.constructArr(new int[]{1,2,3,4,5});
    }
    public int[] constructArr(int[] a) {
        if(a.length==0) return a;
        int[] L = new int[a.length];
        int[] R = new int[a.length];
        L[0] = 1;R[a.length-1]=1;
        for (int i = 1,k = a.length-2; i < a.length; i++,k--) {
            L[i] = L[i-1]*a[i-1];
            R[k] = R[k+1]*a[k+1];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = L[i]*R[i];
        }
        return a;
    }
}
