package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * @author shijiacheng
 */
public class PrintListFromTailToHeadSolution {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            result.add(listNode.val);
        }

        return result;
    }
}



