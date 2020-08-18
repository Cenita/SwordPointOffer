import java.util.Scanner;

public class P20表示数值的字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(isNumber(sc.next()));
        }
    }
    public static boolean isNumber(String s) {
        s = s.trim();
        if(s.isEmpty()) return false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-') s=s.substring(1);
        String A="",B="",C="";
        int flag = 0;
        boolean xs=false,zs=false;
        for(char a:s.toCharArray()){
            if(a=='.'&&flag==0){
                flag=1;
                xs=true;
                continue;
            }
            else if((a=='e'||a=='E')&&(flag==1||flag==0)&&zs==false){
                flag=2;
                zs=true;
                continue;
            }
            if(flag==0) A+=a;
            else if(flag==1) B+=a;
            else if(flag==2) C+=a;
        }
        if((zs&&C.isEmpty())) return false;
        if(A.isEmpty()&&B.isEmpty()) return false;
        if(A.isEmpty()&&B.isEmpty()&&!C.isEmpty()) return false;
        return isZhengshu(A)&&isZhengshu(B)&&isZhishu(C);
    }
    public static boolean isZhengshu(String s){
        for(char c:s.toCharArray()){
            if(c>'9'||c<'0') return false;
        }
        return true;
    }
    public static boolean isZhishu(String s){
        if(!s.isEmpty()&&(s.charAt(0)=='+'||s.charAt(0)=='-')){
            s = s.substring(1);
            if(s.isEmpty()) return false;
        }
        return isZhengshu(s);
    }
}
