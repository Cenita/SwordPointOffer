import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class P36二叉搜索树和双向链表 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    Node pre = null, head = null;  //pre记录上一个节点，head为最后返回的头结点

    public Node treeToDoublyList(Node root) {
        if(root == null) return root;
        helper(root);  //得到一个双向链表，head指向头结点
        head.left = pre;
        pre.right = head;  //形成循环链表
        return head;
    }

    public void helper(Node root){
        if(root == null) return;  //到了最后的时候，就返回
        helper(root.left);  //规整左子树
        root.left = pre;
        if(pre != null){
            pre.right = root;  //当前面还有节点的时候，连接上
        }
        else
            head = root;   //如果前面没有节点了，证明是头结点，就更新head
        pre = root;   //root可以视为一个节点了
        helper(root.right);  //规整右子树
    }
}
