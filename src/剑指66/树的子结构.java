package 剑指66;

/**
 * @CreateTime: 2019-12-03-14:29
 * @Author :杨阳
 * @ClassName :树的子结构
 **/
public class 树的子结构 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {
        TreeNode root1 = null;
        TreeNode root2 = null;
        HasSubtree(root1,root2);


    }
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        boolean flag = false;
        if(root1.val == root2.val){
            flag = doHasSubtree(root1,root2);
            if(flag)
                return true;
            else {
                flag = HasSubtree(root1.right,root2);
                if(flag)
                    return true;
            }
        }
        return false;
    }
    public static boolean doHasSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val!= root2.val)
            return false;

        return doHasSubtree(root1.left,root2.left) && doHasSubtree(root1.right,root2.right);
    }
}
