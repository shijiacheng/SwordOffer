package com.shijc.nowcoder;

/**
 * 反转链表
 * 题目描述
 * 输入一个链表，反转链表后，输出链表的所有元素。
 *
 * @author shijiacheng
 * @date 2018/2/23
 */
public class ReverseListSolution {
    /**
     * 依次遍历所有节点，将所有节点的next指向前一个节点
     */
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;//持有下一个节点的引用
            head.next = pre;//将当前节点对下一个节点的引用指向前一个节点
            pre = head;//将前一个节点指向当前节点
            head = next;//将当前节点指向下一个节点
        }
        return pre;
    }
}


