package 剑指66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @CreateTime: 2019-12-06-09:40
 * @Author :杨阳
 * @ClassName :从上到下打印二叉树
 **/
public class 从上到下打印二叉树 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }


    public static void main(String[] args) {
        TreeNode root = null;

        root.val = 7;
        root.left.val = 5;
        root.left.left.val = 10;
        PrintFromTopToBottom(root);
    }
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root == null)
            return list;

        queue.offer(root);

        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.left!=null)
                queue.offer(root.left);
            if(root.right!=null)
                queue.offer(root.right);
            list.add(root.val);
        }
        return list;
    }
}
