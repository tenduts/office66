package 剑指66;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @CreateTime: 2019-11-28-16:43
 * @Author :杨阳
 * @ClassName :翻转链表
 **/
public class 翻转链表 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;

        while(temp.next !=null){
            System.out.println(">.............");
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}

class ListNode{

    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}

class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        printListFromTailToHead(listNode,arrayList);
        return arrayList;
    }
    public void printListFromTailToHead(ListNode listNode ,ArrayList<Integer> list) {
        if(listNode.next!=null)
            printListFromTailToHead(listNode.next,list);
        list.add(listNode.val);

    }
}


