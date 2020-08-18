import java.util.*;

public class P32拓展3之打印从上到下打印二叉树 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> toQueueStack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        queue.add(root);
        while(!queue.isEmpty()||!stack.isEmpty()){
            List<Integer> row = new ArrayList<>();
            if(!queue.isEmpty()){
                while(!queue.isEmpty()){
                    row.add(queue.peek().val);
                    if(queue.peek().left!=null) stack.add(queue.peek().left);
                    if(queue.peek().right!=null) stack.add(queue.peek().right);
                    queue.poll();
                }
            }else{
                while(!stack.isEmpty()){
                    row.add(stack.peek().val);
                    toQueueStack.push(stack.pop());
                }
                while(!toQueueStack.isEmpty()){
                    if(toQueueStack.peek().left!=null) queue.add(toQueueStack.peek().left);
                    if(toQueueStack.peek().right!=null) queue.add(toQueueStack.peek().right);
                    toQueueStack.pop();
                }
            }
            result.add(row);
        }
        return result;
    }
}
