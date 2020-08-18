public class P27二叉树的镜像 {
    public static void main(String[] args) {

    }
    public static TreeNode mirrorTree(TreeNode root) {
        mirror(root);
        return root;
    }
    public static void mirror(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
