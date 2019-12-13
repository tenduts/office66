package 剑指66;

import java.util.Stack;

/**
 * @CreateTime: 2019-11-29-11:23
 * @Author :杨阳
 * @ClassName :两个栈实现队列
 **/
public class 两个栈实现队列 {
    public static void main(String[] args) {
        Stack stack;
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
