import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class P18删除链表节点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        ListNode delete = new ListNode(1);
        head.next.next = delete;
        head.next.next.next = new ListNode(9);
        ListNode result = deleteNode(head,delete);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode deleteNode(ListNode head, int val) {
        if(head==null) return null;
        if(head.val==val) return head.next;
        ListNode index = head;
        while(index.next!=null&&index.next.val!=val){
            index = index.next;
        }
        if(index.next==null) return head;
        index.next = index.next.next;
        return head;
    }
    public static ListNode deleteNode(ListNode head, ListNode deleteNode) {
        //判断是否为空，空则空
        if(head==null||deleteNode==null) return null;
        //判断是否为头结点
        if(head.val==deleteNode.val) return head.next;
        //判断最后是否还有节点
        if(deleteNode.next==null){
            deleteNode(head,deleteNode.val);
        }
        //跨节点O(1)方式删除
        deleteNode.val = deleteNode.next.val;
        deleteNode.next = deleteNode.next.next;
        return head;
    }
}
