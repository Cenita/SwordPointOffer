public class P68I二叉树的最近公共祖先 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        a.left = b;
        a.right=c;
        c.left=d;
        b.right=e;
        P68I二叉树的最近公共祖先 g = new P68I二叉树的最近公共祖先();
        System.out.println(g.lowestCommonAncestor(a,d,e).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p) return p;
        if(root==q) return q;
        TreeNode left=null,right=null;
        if(root.left!=null) left=lowestCommonAncestor(root.left,p,q);
        if(root.right!=null) right=lowestCommonAncestor(root.right,p,q);
        if((left==p&&right==q)||(left==q&&right==p)) return root;
        else if(left==p||left==q) return left;
        else if(right==p||right==q) return right;
        else if(left==null||right!=null) return right;
        else if(left!=null||right==null) return left;
        else return null;
    }
}
