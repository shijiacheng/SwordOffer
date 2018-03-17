package com.shijc.nowcoder;

/**
 * 两个链表的第一个公共结点
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * @author shijiacheng
 * @date 2018/3/14
 */
public class FirstCommonNodeInListsSolution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        int length1 = getListLength(pHead1);
        int length2 = getListLength(pHead2);

        ListNode pLongHead = pHead1;
        ListNode pShortHead = pHead2;
        int diff = length1 - length2;

        if (length1 - length2 < 0) {
            pLongHead = pHead2;
            pShortHead = pHead2;
            diff = length2 - length1;
        }

        for (int i = 0; i < diff; i++) {
            pLongHead = pLongHead.next;
        }

        while (pLongHead != null && pShortHead != null && pLongHead != pShortHead) {
            pLongHead = pLongHead.next;
            pShortHead = pShortHead.next;
        }

        ListNode commonNode = pLongHead;
        return commonNode;

    }

    private int getListLength(ListNode pHead) {
        int length = 0;
        ListNode node = pHead;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
