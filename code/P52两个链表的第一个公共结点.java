public class P52两个链表的第一个公共结点 {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        if(lengthA>lengthB){
            int a = lengthA-lengthB;
            for(int i=0;i<a;i++){
                headA = headA.next;
            }
        }else{
            int b = lengthB-lengthA;
            for(int i=0;i<b;i++){
                headB = headB.next;
            }
        }
        while(headA!=headB&&headA!=null&&headB!=null){
            headA = headA.next;
            headB = headB.next;
        }
        if(headA==headB){
            return headA;
        }else{
            return null;
        }
    }
    public int getLength(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
