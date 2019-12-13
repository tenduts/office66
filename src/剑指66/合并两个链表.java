package 剑指66;

/**
 * @CreateTime: 2019-12-03-09:36
 * @Author :杨阳
 * @ClassName :合并两个链表
 **/
public class 合并两个链表 {
     public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(0);

        Merge(listNode1,listNode2);
    }

        public static ListNode Merge(ListNode list1,ListNode list2) {
            ListNode resultList = new ListNode(0);//新建一个头结点
            ListNode tempHead = resultList;
            while(list1 != null && list2!= null){
                if(list1.val<list2.val){
                    tempHead.next = list1;
                    list1 = list1.next;
                }
                else{
                    tempHead.next = list2;
                    list2 = list2.next;
                }
                tempHead = tempHead.next;
            }

            if(list1 == null)//如果链表1为空，那么链表可能不为空
            {
                tempHead.next = list2;//所以把链表2接到后面
            }else{
                tempHead.next = list1;//否则说明链表2为空，把链表1接到后面
            }


            return resultList.next;
        }
}

