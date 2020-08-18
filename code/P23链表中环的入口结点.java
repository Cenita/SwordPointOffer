import java.util.List;

public class P23链表中环的入口结点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode currentHead = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        ListNode circulNode = head.next;
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        head.next = new ListNode(6);
        head = head.next;
        head.next = circulNode;
        getCirculNode(currentHead);
    }
    public static ListNode getCirculNode(ListNode head){
        if(head==null) return null;
        //1.先确定是不是环，使用两个指针看会不会追上去
        ListNode p1,p2;
        boolean startFlag=false;
        p1=head;
        p2=head;
        while(p1!=p2||!startFlag){
            startFlag=true;
            if(p1==null) return null;
            if(p1.next==null) return null;
            p1 = p1.next.next;
            p2 = p2.next;
        }
        //2.计算环的长度
        int count=1;
        p2 = p2.next;
        while(p1!=p2){
            p2 = p2.next;
            count++;
        }
        //3.根据环的长度,p1先走k下，p2再走，当相遇的时候就是环的入口点
        p1=head;
        p2=head;
        for(int i=0;i<count;i++){
            p1=p1.next;
        }
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
