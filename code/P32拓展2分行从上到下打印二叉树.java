import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P32拓展2分行从上到下打印二叉树 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        queue1.add(root);
        while(!queue1.isEmpty()||!queue2.isEmpty()){
            List<Integer> row = new ArrayList<>();
            if(!queue1.isEmpty()){
                while(!queue1.isEmpty()){
                    row.add(queue1.peek().val);
                    if(queue1.peek().left!=null) queue2.add(queue1.peek().left);
                    if(queue1.peek().right!=null) queue2.add(queue1.peek().right);
                    queue1.poll();
                }
            }else{
                while(!queue2.isEmpty()){
                    row.add(queue2.peek().val);
                    if(queue2.peek().left!=null) queue1.add(queue2.peek().left);
                    if(queue2.peek().right!=null) queue1.add(queue2.peek().right);
                    queue2.poll();
                }
            }
            result.add(row);
        }
        return result;
    }
}
