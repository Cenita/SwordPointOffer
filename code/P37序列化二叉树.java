import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P37序列化二叉树 {
    public static void main(String[] args) {
        serialize(deserialize("[1,2,3,null,null,4,5]"));
    }
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root==null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.offer(root);
        while(queue.size()!=0){
            TreeNode t = queue.peek();
            if(t!=null){
                result.add(t.val);
                queue.offer(t.left);
                queue.offer(t.right);
            }else{
                result.add(null);
            }
            queue.poll();
        }
        //去掉尾部的null
        int end=result.size()-1;
        while(result.get(end)==null)end--;
        result = result.subList(0,end+1<result.size()?end+1:result.size()-1);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean isFrist=true;
        for(Integer a:result){
            if(isFrist==true){
                isFrist=false;
            }else{
                sb.append(",");
            }
            if(a!=null)sb.append(a);
            else sb.append("null");
        }
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data.length()<=2) return null;
        String trueData = data.substring(1,data.length()-1);
        String[] shuzu = trueData.split(",");
        Integer[] newData = new Integer[shuzu.length+4];
        for (int i = 0; i < shuzu.length; i++) {
            if(shuzu[i].equals("null")){
                newData[i] = null;
            }else{
                newData[i] = Integer.valueOf(shuzu[i]);
            }
        }
        Queue<TreeNode> result = new LinkedList<>();
        result.offer(new TreeNode(newData[0]));
        TreeNode head = result.peek();
        for (int i = 1; i < newData.length;) {
            TreeNode t = result.peek();
            Integer left = newData[i++];
            if(left!=null){
                t.left = new TreeNode(left);
                result.offer(t.left);
            }
            if(i>=newData.length) break;
            Integer right = newData[i++];
            if(right!=null){
                t.right = new TreeNode(right);
                result.offer(t.right);
            }
            result.poll();
        }
        return head;
    }
}
