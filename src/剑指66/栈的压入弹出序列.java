package 剑指66;

import java.util.Arrays;
import java.util.Stack;

/**
 * @CreateTime: 2019-12-06-09:09
 * @Author :杨阳
 * @ClassName :栈的压入弹出序列
 **/
public class 栈的压入弹出序列 {
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popB = {4,5,3,2,1};
//list = 1
//list = 1 2 3 4
//list = 1 2 3 5
//list = 1 2 3
        System.out.println(IsPopOrder(pushA,popB));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length)
            return false;
        Stack<Integer> stack1 = new Stack<>();//栈记录压栈
        int j = 1;
        stack1.push(pushA[0]);//栈中先压入push压栈序列的第一个数
        for(int i=0;i<popA.length;i++)
        {
            System.out.println("------------");
            while(j < pushA.length && stack1.peek() != popA[i])
            {//如果栈顶的数和弹出序列不一样，就一直压栈，因为必须是从栈顶弹出的！
                stack1.push(pushA[j]);
                System.out.println(pushA[j]+";;;;;"+j);
                j++;
            }
            if(j >= pushA.length && stack1.peek() != popA[i])
                return false;//如果j已经到达压栈序列的末尾，但是栈顶的数还是和弹出序列当前的数不一致
            //说明没有这个序列
            stack1.pop();
        }
        return true;
    }



//    public static boolean IsPopOrder(int [] pushA,int [] popB) {
//        if(pushA.length!=popB.length)
//            return false;
//        Stack<Integer> list = new Stack<>();
//        list.push(pushA[0]);
//        int a = 0;
//        int b = 0;
//        for(int i=0;i<pushA.length;i++){
//            while(b<popB.length && list.peek()!=popB[b]){
//                b++;
//                list.push(popB[b]);
//            }
//            if(b>=popB.length && list.peek()!=popB[i])
//                return false;
//            list.pop();
//        }
//
//        return true;
//    }
}

