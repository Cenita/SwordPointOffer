import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class P06从尾到头打印链表 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(2);
        for(int g:reversePrint(a)){
            System.out.println(g);
        }
    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        while(head!=null){
            st.push(head.val);
            head = head.next;
        }
        int result[] = new int[st.size()];
        int index=0;
        while(!st.empty()){
            result[index++]=st.pop();
        }
        return result;
    }
}
