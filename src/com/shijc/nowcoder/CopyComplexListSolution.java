package com.shijc.nowcoder;

/**
 * 复杂链表的复制
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * @author shijiacheng
 * @date 2018/2/26
 */
public class CopyComplexListSolution {
    public RandomListNode Clone(RandomListNode pHead) {
        CloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return reconnectNodes(pHead);
    }

    /**
     * 第一步：复制链表
     *
     * @param pHead
     */
    private void CloneNodes(RandomListNode pHead) {
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode cloneNode = new RandomListNode(0);
            cloneNode.label = node.label;
            cloneNode.next = node.next;
            cloneNode.random = null;

            node.next = cloneNode;
            node = cloneNode.next;
        }
    }

    /**
     * 第二步：复制链表的指向
     *
     * @param pHead
     */
    private void ConnectRandomNodes(RandomListNode pHead) {
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode cloneNode = node.next;
            if (node.random != null) {
                cloneNode.random = node.random.next;
            }

            node = cloneNode.next;
        }
    }

    /**
     * 第三步：拆分链表
     *
     * @param pHead
     * @return
     */
    private RandomListNode reconnectNodes(RandomListNode pHead) {
        RandomListNode node = pHead;
        RandomListNode cloneHead = null;
        RandomListNode cloneNode = null;

        if (node != null) {
            cloneHead = cloneNode = node.next;
            node.next = cloneNode.next;
            node = node.next;
        }

        while (node != null) {
            cloneNode.next = node.next;
            cloneNode = cloneNode.next;
            node.next = cloneNode.next;
            node = node.next;
        }

        return cloneHead;
    }
}
