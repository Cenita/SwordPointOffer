
public class P22链表中倒数第K个节点 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode currentHead = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        getKthFromEnd(currentHead,2);
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if(k<=0||head==null) return null;
        ListNode p1,p2;
        p1=head;
        for(int i=0;i<k;i++){
            if(p1==null) return null;
            p1 = p1.next;
        }
        p2 = head;
        while(p1!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}
