package com.shijc.nowcoder;

/**
 * 链表中环的入口结点
 * 题目描述
 * 一个链表中包含环，请找出该链表的环的入口结点。
 *
 * @author shijiacheng
 * @date 2018/3/10
 */
public class EntryNodeInListLoopSolution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        ListNode pMeetNode = MeetingNode(pHead);
        if (pMeetNode == null) {
            return null;
        }
        int loopLength = 1;//记录环的长度
        ListNode node1 = pMeetNode;
        while (node1.next != pMeetNode) {
            node1 = node1.next;
            loopLength++;
        }

        //将node1从头结点移动到环的长度的位置
        node1 = pHead;
        for (int i = 0; i < loopLength; i++) {
            node1 = node1.next;
        }
        // 创建node2在头结点处，node1和node2同时向下遍历，重合的时候就是还的入口
        ListNode node2 = pHead;
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }

    /**
     * 思路：两个指针，一个一次走两步，一个走一步，如果相遇就是环
     * 如果是环，两个指针相遇的节点
     *
     * @param pHead
     * @return
     */
    private ListNode MeetingNode(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode pSlow = pHead.next;
        if (pSlow == null) {
            return null;
        }
        ListNode pFast = pSlow.next;
        while (pSlow != null && pFast != null) {
            if (pFast == pSlow) {
                return pFast;
            }
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast != null) {
                pFast = pFast.next;
            }
        }
        return null;
    }
}
