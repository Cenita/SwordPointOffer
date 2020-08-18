public class P54二叉搜索树第K大的结点 {
    private int count = 0;
    public int kthLargest(TreeNode root, int k) {
        return findBigNums(root,k);
    }
    public int findBigNums(TreeNode root,int k){
        if(count>k) return -1;
        if(root.right!=null){
            int result = findBigNums(root.right,k);
            if(result!=-1) return result;
        }
        if(k==++count) return root.val;
        if(root.left!=null){
            int result = findBigNums(root.left,k);
            if(result!=-1) return result;
        }
        return -1;
    }
}
