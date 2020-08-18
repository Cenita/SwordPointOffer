import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P34二叉树中和为某一值的路径 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        pathSum(root,9);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new LinkedList<>();
        List<List<Integer>> totalPath = new ArrayList<>();
        dfs(sum,0,root,totalPath,path);
        return totalPath;
    }
    public static void dfs(int sum,int pathSum,TreeNode root,List<List<Integer>> totalPath,List<Integer> path){
        if(root==null) return;
        pathSum+=root.val;
        path.add(root.val);
        if(sum==pathSum&&root.left==null&&root.right==null){
            List<Integer> copy = new ArrayList<>();
            for(int a:path) copy.add(a);
            totalPath.add(copy);
        }
        dfs(sum,pathSum,root.left,totalPath,path);
        dfs(sum,pathSum,root.right,totalPath,path);
        path.remove(path.size()-1);
        return;
    }
}
