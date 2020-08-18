import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P32从上到下打印二叉树 {
    public static void main(String[] args) {

    }
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[]{};
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            if(queue.peek()==null){
                queue.poll();
                continue;
            }
            queue.offer(queue.peek().left);
            queue.offer(queue.peek().right);
            result.add(queue.poll().val);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
