public class P24翻转链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode currentHead = head;
//        head.next = new ListNode(2);
//        head = head.next;
//        head.next = new ListNode(3);
//        head = head.next;
//        head.next = new ListNode(4);
//        head = head.next;
//        head.next = new ListNode(5);
        reverseList(currentHead);
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode p1=head,p2=null,p3=null;
        while(p1!=null){
            p2 = p1;
            p1 = p1.next;
            p2.next = p3;
            p3 = p2;
        }
        return p2;
    }
}
