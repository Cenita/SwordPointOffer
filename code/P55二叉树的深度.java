public class P55二叉树的深度 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
