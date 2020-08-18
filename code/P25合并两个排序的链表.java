public class P25合并两个排序的链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode currentHead = head;
        mergeTwoLists(new ListNode(2),new ListNode(1));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        if(l1==null&&l2!=null) return l2;
        if(l1!=null&&l2==null) return l1;
        ListNode head;
        ListNode currentHead;
        if(l1.val<l2.val){
            head=l1;
            l1 = l1.next;
        }else{
            head=l2;
            l2 = l2.next;
        }
        currentHead = head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1!=null) head.next = l1;
        if(l2!=null) head.next = l2;
        return currentHead;
    }
}
