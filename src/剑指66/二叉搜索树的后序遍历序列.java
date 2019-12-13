package 剑指66;

/**
 * @CreateTime: 2019-12-13-15:17
 * @Author :杨阳
 * @ClassName :二叉搜索树的后序遍历序列
 **/
public class 二叉搜索树的后序遍历序列 {
    public static void main(String[] args) {
        int [] list = {5,7,6,9,11,10,8};
        System.out.println(VerifySquenceOfBST(list));
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        return verify(sequence,0,sequence.length-1);
    }

    public static boolean verify(int [] sequence,int begin,int end)
    {
        if(begin == end)
            return true;
        int rootValue = sequence[end];
        int leftBegin = -1;//左子树的左边界
        int leftEnd = -1;//左子树的右边界
        int rightBegin = -1;//右子树的左边界
        int rightEnd = -1;//右子树的右边界
        if(sequence[begin] < rootValue)// 说明存在左子树，二叉搜索树的性质
            leftBegin = begin;//记录左子树的左边界
        for(int i=begin;i<end;i++){
            if(sequence[i]<rootValue)
                leftEnd = i;
            else{
                if(rightBegin == -1) //记录右子树的左边界，这个条件判断只会记录一次。
                    rightBegin = i;
                rightEnd = i;//记录右子树的右边界
            }
        }
        if(rightBegin < leftEnd && rightBegin != -1)
            return false;//如果左子树的右边界 大于 右子树的左边界 就出问题了！false
        return verify(sequence,leftBegin,leftEnd) && verify(sequence,rightBegin,rightEnd);
    }
}
