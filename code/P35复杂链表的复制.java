import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class P35复杂链表的复制 {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        a.next = b;
        b.next = c;
        a.random = a;
        b.random = a;
        c.random = b;
        copyRandomList(a);
    }
    public static Node copyRandomList(Node head) {
        if(head==null) return null;
        //方法2 使用复制假结点分离结点来实现复制链表
        Node t=head;
        //第一步 在每个结点后面新建假结点
        while(t!=null){
            Node temp = new Node(t.val);
            temp.next = t.next;
            t.next = temp;
            t=t.next.next;
        }
        //第二步，复制完链表后将假链表中复制random值
        t = head;
        while(t!=null){
            t.next.random = t.random!=null?t.random.next:null;
            t = t.next.next;
        }
        //第三步，分离假链表和原始链表
        t = head;
        Node _t = head.next;
        Node _head = head.next;
        while(t!=null){
            t.next = t.next.next;
            t = t.next;
            if(_t.next!=null){
                _t.next = _t.next.next;
                _t = _t.next;
            }
        }
        return _head;
    }
}
