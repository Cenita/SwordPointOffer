import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class P48最长不含重复字符的字符串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> container = new HashMap<>();
        int max = 0,l=0;
        char[] cn = s.toCharArray();
        for (int i = 0; i < cn.length; i++) {
            char c = cn[i];
            Integer cnum = container.get(c);
            if(cnum==null){
                container.put(c,i);
            }else{
                if(cnum>=l){
                    l=container.get(c)+1;
                }
                container.put(c,i);

            }
            max = max>(i-l+1)?max:(i-l+1);
        }
        return max;
    }
}
