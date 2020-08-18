import java.util.Stack;

public class P15Excel序号进制附加题 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
        System.out.println(convertToTitle(1));
    }
    //10进制转26进制
    public static int titleToNumber(String s) {
        if(s.equals("")) return 0;
        char[] str = s.toCharArray();
        int result = 0;
        for(int i=str.length-1;i>=0;i--){
            int index = str.length-1-i;
            int mi = (int)Math.pow(26,index);
            result+=(str[i]-'A'+1)*mi;
        }
        return result;
    }
    //26进制转10进制
    public static String convertToTitle(int n) {
        String result = "";
        if(n<0) return result;
        //10进制转换任意进制使用除留去余法
        Stack<Character> con = new Stack<Character>();
        while(n>0){
            //非常重要，逻辑上是1，实际是0，每一位都要减去！
            n--;
            con.push((char)((n)%26+'A'));
            n/=26;
        }
        while(!con.isEmpty()) result+=con.pop();
        return result;
    }
}
