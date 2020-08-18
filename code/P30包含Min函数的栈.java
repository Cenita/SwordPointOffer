import java.util.Stack;

public class P30包含Min函数的栈 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());


    }
}
class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int x) {
        mainStack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int min = x<minStack.peek()?x:minStack.peek();
            minStack.push(min);
        }
    }
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    public int top() { return mainStack.peek(); }
    public int min() { return minStack.peek(); }
}
