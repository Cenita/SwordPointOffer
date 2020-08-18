import java.util.Arrays;

public class P33二叉搜索树的后序遍历序列 {
    public static void main(String[] args) {
        System.out.println(verifyPostorder(new int[]{7,8,6}));
    }
    public static boolean verifyPostorder(int[] postorder) {
        if(postorder.length==0) return true;
        if(postorder.length==1) return true;
        int root = postorder[postorder.length-1];
        int index=0,leftRoot=0;
        //遍历左子树结点判断是否都小于根节点
        while(postorder[index]<root){
            if(postorder[index++]>root) return false;
        }
        //找到右子树的根节点位置
        leftRoot = index;
        //遍历右子树结点是不是都大于根节点
        while(index<postorder.length-1){
            if(postorder[index++]<root) return false;
        }
        //获取左右子树的数组
        int[] leftTree = Arrays.copyOfRange(postorder,0,leftRoot);
        int[] rightTree = Arrays.copyOfRange(postorder,leftRoot,postorder.length-1);
        //获取左右子树是否同样符合搜索树+后序遍历的结果
        boolean leftResult = verifyPostorder(leftTree);
        boolean rightResult = verifyPostorder(rightTree);
        return leftResult&&rightResult;
    }
}
