import java.util.ArrayList;

public class P28对称的二叉树 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return false;
        return isLeftRightSymmetric(root.left,root.right);
    }
    public boolean isLeftRightSymmetric(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null) return true;
        if (root1==null||root2==null) return false;
        if (root1.val!=root2.val) return false;
        return isLeftRightSymmetric(root1.left,root2.right)&&
                isLeftRightSymmetric(root1.right,root2.left);
    }
}
