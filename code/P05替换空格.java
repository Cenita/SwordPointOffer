
public class P05替换空格 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
        char[] oldS = s.toCharArray();
        int count = 0;
        //计算有多少个空格
        for(Character c:oldS){
            if(c==' ') count++;
        }
        //数组生成则是原长度+空格数*2
        char[] newS = new char[s.length()+count*2];
        //指针p1指向原数组尾部，指针p2指向新数组尾部
        int p1=oldS.length-1,p2=newS.length-1;
        //遍历完数组
        while (p2>=0){
            //如果遇到空格则粘贴%20
            if(oldS[p1]==' '){
                //遇到则粘贴
                p1--;
                newS[p2--]='0';
                newS[p2--]='2';
                newS[p2--]='%';
            }else{
                //如果没遇到则直接复制
                newS[p2--]=oldS[p1--];
            }
        }
        return String.valueOf(newS);
    }
}
