package 题库.链表反转;

import java.util.List;

public class ReverseList {
    // 创建内部类定义节点类型
    static class ListNode {
        int val;
        ListNode next;
        // 内部类构造方法书写构造计
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode recursion(ListNode head){
        if(head.next != null || head != null){
        /**
         * 需要从最后一个开始，就使用递归递归到最后一个元素
         * 然后，在从后往前实现
         * 注意这里递归的时候，需要判断递归是否越界
         * 否则，会无限的进行下去
         * 且整个链表不为空
         */
            recursion(head.next);
            head.next.next = head;
            head.next = null;
            return null;
        }else{return head;}
    }
}
