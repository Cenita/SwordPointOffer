import java.util.Stack;

public class P31栈的压入弹出 {
    public static void main(String[] args) {
        validateStackSequences(new int[]{1,0},new int[]{1,0});
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length) return false;
        if(pushed.length==0&&popped.length==0) return true;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(index<popped.length&&!stack.isEmpty()&&popped[index]==stack.peek()){
                if(!stack.isEmpty()) stack.pop();
                index++;
            }
        }
        if(!stack.isEmpty())return false;
        return true;
    }
}
