import java.util.*;

public class P50第一个只出现一次的字符 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }
    public static char firstUniqChar(String s) {
        int temp[]=new int[26];
        char str[]=s.toCharArray();
        for(char c: str){
            temp[c-'a']++;
        }
        for(char c:str){
            if(temp[c-'a']==1){
                return c;
            }
        }
        return ' ';
    }
}
