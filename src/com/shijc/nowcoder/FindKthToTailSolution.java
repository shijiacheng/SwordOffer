package com.shijc.nowcoder;

/**
 * 链表中倒数第K个节点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @author shijiacheng
 * @date 2018/2/23
 */
public class FindKthToTailSolution {
    /**
     * 思路：两个指针，先让第一个指针和第二个指针都指向头结点，
     * 然后再让第一个指正走(k-1)步，到达第k个节点。然后两个
     * 指针同时往后移动，当第一个结点到达末尾的时候，第二个结
     * 点所在位置就是倒数第k个节点。
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode last = head;
        for (int i = 1; i < k; i++) {
            if (head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }
        while (head.next != null) {
            head = head.next;
            last = last.next;
        }
        return last;
    }
}
