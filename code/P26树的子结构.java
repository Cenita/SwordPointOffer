public class P26树的子结构 {
    public static void main(String[] args) {
        TreeNode C = new TreeNode(4);
        C.left = new TreeNode(1);
        C.right = new TreeNode(2);
        TreeNode B = new TreeNode(3);
        B.left = C;
        B.right = new TreeNode(5);
        TreeNode Test = new TreeNode(4);
        Test.left = new TreeNode(1);
        System.out.println(isSubStructure(B,Test));
    }
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null) return false;
        return dfs(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    public static boolean dfs(TreeNode A,TreeNode B){
        if(B==null) return true;
        if(A==null) return false;
        return A.val==B.val&&dfs(A.left,B.left)&&dfs(A.right,B.right);
    }
}
