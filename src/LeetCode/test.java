package LeetCode;

import java.util.Stack;

/**
 * @CreateTime: 2019-12-02-11:49
 * @Author :杨阳
 * @ClassName :test
 **/
public class test {
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {5,4,3,2,1};
        IsPopOrder(pushA,popA);
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer>stack = new Stack<>();
        boolean flag = true;
        int i=5;
        int n =0;
        while(i<3){
//            if (popA[i] == pushA[n])
//                stack.push()

        }


        return  flag;
    }
}