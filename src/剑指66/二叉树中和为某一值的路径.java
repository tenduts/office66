package 剑指66;

import java.util.ArrayList;

/**
 * @CreateTime: 2019-12-13-15:58
 * @Author :杨阳
 * @ClassName :二叉树中和为某一值的路径
 **/
public class 二叉树中和为某一值的路径 {
    public static void main(String[] args) {


    }
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> pathAll = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        if(root == null) return pathAll;
        path.add(root.val);
        target-=root.val;
        if(target == 0&& root.left == null && root.right == null)
            pathAll.add(new ArrayList<>(path));
        FindPath(root.left,target);
        FindPath(root.left,target);
        path.remove(path.size());
        return pathAll;
    }


}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}
