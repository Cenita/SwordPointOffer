import java.util.LinkedList;

public class P09用两个栈实现队列 {
    public static void main(String[] args) {
        CQueue a = new CQueue();
        a.appendTail(5);
        a.appendTail(6);
        System.out.println(a.deleteHead());
        a.appendTail(3);
        System.out.println(a.deleteHead());
        System.out.println(a.deleteHead());
        System.out.println(a.deleteHead());
    }
}
class CQueue {
    LinkedList<Integer> stack1 = new LinkedList<Integer>();
    LinkedList<Integer> stack2 = new LinkedList<Integer>();
    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.addFirst(value);
    }

    public int deleteHead() {
        if(stack2.size()==0){
            while(!stack1.isEmpty()){
                stack2.addFirst(stack1.pop());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        return -1;
    }
}
