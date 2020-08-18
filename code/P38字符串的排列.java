import java.util.*;

public class P38字符串的排列 {
    public static void main(String[] args) {
        permutation("abc");
    }
    public static String[] permutation(String s) {
        List<String> result = new ArrayList<>();
        permutation(result,s.toCharArray(),0);
        return result.toArray(new String[result.size()]);
    }
    public static void permutation(List<String> result,char[] s,int index){
        if(index==s.length-1){
            StringBuilder sb = new StringBuilder();
            for(char a:s) sb.append(a);
            result.add(sb.toString());
        }else{
            for(int i=index;i<s.length;i++){
                boolean flag = true;
                for(int j = index;j<i;j++)//字母相同时，等效，剪枝
                    if(s[j] == s[i])
                        flag = false;
                    //此处剪枝
                if(!flag) continue;
                swap(s,index,i);
                permutation(result,s,index+1);
                swap(s,i,index);
            }
        }
    }
    public static void swap(char[] s,int a,int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
