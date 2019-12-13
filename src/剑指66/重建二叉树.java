package 剑指66;

/**
 * @CreateTime: 2019-11-28-17:26
 * @Author :杨阳
 * @ClassName :重建二叉树
 **/
public class 重建二叉树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        TreeNode  treeNode =   reConstructBinaryTree(a,0,a.length-1,b,0,b.length-1);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int a,int Lpre,int [] in,int b,int Lin) {
        if(a>Lpre)return null;

        TreeNode treeNode = new TreeNode(0);

        return treeNode;
    }
}
