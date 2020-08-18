import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class P07重建二叉树 {
    public static void main(String[] args) {

        int b[] ={9,3,15,20,7};
        int a[] ={3,9,20,15,7};
        TreeNode c = buildTree(a,b);
        System.out.println("aasdsd");
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Integer a[]=new Integer[preorder.length],b[]=new Integer[inorder.length];
        for(int i=0;i<preorder.length;i++){
            a[i]=preorder[i];
            b[i]=inorder[i];
        }
        return diguiTree(Arrays.asList(a),Arrays.asList(b));
    }
    public static TreeNode diguiTree(List<Integer> preorder, List<Integer> inorder){
        if(preorder.size()==0 || inorder.size()==0) return null;
        int target = preorder.get(0);
        TreeNode node = new TreeNode(target);
        int index = findItem(inorder,target);
        List<Integer> rightInorder = new ArrayList<Integer>(){};
        List<Integer> leftInorder = new ArrayList<Integer>();
        if(index!=-1){
           rightInorder = inorder.subList(0,index);
           leftInorder = preorder.subList(1,index+1);
        }
        node.left = diguiTree(leftInorder,rightInorder);
        List<Integer> rightInorder2 = new ArrayList<Integer>(){};
        List<Integer> leftInorder2 = new ArrayList<Integer>();
        if(index!=-1){
            rightInorder2 = inorder.subList(Math.min(index+1,inorder.size()),inorder.size());
            leftInorder2 = preorder.subList(index+1,preorder.size());
        }
        node.right = diguiTree(leftInorder2,rightInorder2);
        return node;
    }
    public static int findItem(List<Integer> array,int target){
        for(int i=0;i<array.size();i++){
            if(array.get(i).equals(target)) return i;
        }
        return -1;
    }
}
