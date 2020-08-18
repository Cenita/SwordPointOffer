public class P67把字符串转换成整数 {
    public static void main(String[] args) {
        P67把字符串转换成整数 a = new P67把字符串转换成整数();
        System.out.println(a.strToInt("1095502006p8"));
    }
    public int strToInt(String str) {
        if(str.length()==0) return 0;
        boolean isFu = false;
        boolean isZero = true;
        char[] s  = str.toCharArray();
        StringBuilder intersb = new StringBuilder();
        boolean isStart = false;
        for (int i = 0; i < s.length; i++) {
            if((s[i]=='-'||s[i]=='+')&&!isStart){
                if(i+1<s.length&&isDiget(s[i+1])){
                    isStart = true;
                    if(s[i]=='-')isFu = true;
                }else{
                    return 0;
                }
            }else if(isDiget(s[i])){
                isStart = true;
                if(charToInt(s[i])!=0) isZero=false;
                if(!isZero) intersb.append(s[i]);

            }else if(isStart&&!isDiget(s[i])){
                break;
            }else if(!isStart&&(!isDiget(s[i])&&s[i]!=' ')&&intersb.length()==0){
                return 0;
            }
        }
        if(intersb.length()==0) return 0;
        if(intersb.length()>10){
            //越界
            if(isFu) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }else if(intersb.length()==10){
            //越界判断
            String max = String.valueOf(Integer.MAX_VALUE);
            String min = String.valueOf(Integer.MIN_VALUE).substring(1);
            if(isFu){
                for (int i = 0; i < intersb.length(); i++) {
                    if(min.charAt(i)<intersb.charAt(i)) return Integer.MIN_VALUE;
                    if(min.charAt(i)>intersb.charAt(i)) break;
                }
                return StringToInt(intersb.toString(),isFu);
            }else{
                for (int i = 0; i < intersb.length(); i++) {
                    if(max.charAt(i)<intersb.charAt(i)) return Integer.MAX_VALUE;
                    if(max.charAt(i)>intersb.charAt(i)) break;
                }
                return StringToInt(intersb.toString(),isFu);
            }
        }else{
            return StringToInt(intersb.toString(),isFu);
        }
    }
    public int StringToInt(String a,boolean isFu){
        int re = 0;
        int diget = 1;
        for (int i = a.length()-1; i >=0 ; i--) {
            char c = a.charAt(i);
            re+=charToInt(c)*diget;
            diget*=10;
        }
        if(isFu) return -re;
        else return re;
    }
    public boolean isDiget(char a){
        return a<='9'&&a>='0';
    }
    public int charToInt(char a){
        return a-'0';
    }
}
