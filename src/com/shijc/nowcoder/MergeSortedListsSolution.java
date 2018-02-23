package com.shijc.nowcoder;

/**
 * 合并两个排序的链表
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * @author shijiacheng
 * @date 2018/2/23
 */
public class MergeSortedListsSolution {
    /**
     * 链表1的头结点的值小于链表2的头结点的值，因此链表1的头结点是合并后链表的头结点。
     * 在剩余的结点中，链表2的头结点的值小于链表1的头结点的值，因此链表2的头结点是剩
     * 余结点的头结点，把这个结点和之前已经合并好的链表的尾结点链接起来。
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode mergeNode = null;
        if (list1.val < list2.val) {
            mergeNode = list1;
            mergeNode.next = Merge(list1.next, list2);
        } else {
            mergeNode = list2;
            mergeNode.next = Merge(list1, list2.next);
        }

        return mergeNode;
    }
}
