package 剑指66;

import java.util.Stack;

import static java.lang.Integer.MAX_VALUE;

/**
 * @CreateTime: 2019-12-13-10:50
 * @Author :杨阳
 * @ClassName :包含min函数的栈
 **/
public class 包含min函数的栈 {
    Stack<Integer> stack1 = new Stack<Integer>();
    int a = MAX_VALUE;
    public static void main(String[] args) {

    }

    public void push(int node) {
        stack1.push(node);
        if (node<a)
            a = node;
    }

    public void pop() {
        stack1.pop();
    }

    public int top() {
        return a;
    }

    public int min() {
        return a;
    }
}
