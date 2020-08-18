public class P58I翻转单词顺序 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int right = s.length()-1;
        boolean isFrist = false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(i==right){
                    right=i-1;
                    continue;
                }
                if(isFrist) sb.append(" ");
                sb.append(s.substring(i+1,right+1));
                right = i-1;
                isFrist=true;
            }else if(i==0){
                if(isFrist) sb.append(" ");
                sb.append(s.substring(i,right+1));
            }
        }
        return sb.toString();
    }
}
