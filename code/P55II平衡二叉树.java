public class P55II平衡二叉树 {
    private boolean isBa = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        isBa=true;
        maxDepth(root);
        return isBa;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left-right)>1) isBa=false;
        return Math.max(left,right)+1;
    }
}
