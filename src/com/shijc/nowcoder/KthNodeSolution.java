package com.shijc.nowcoder;

import java.util.ArrayList;

/**
 * 二叉搜索树的第k个结点
 * 题目描述
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，
 * 按结点数值大小顺序第三个结点的值为4。
 *
 * @author shijiacheng
 * @date 2018/3/16
 */
public class KthNodeSolution {
    ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {

        if (pRoot == null || k <= 0) {
            return null;
        }
        inOrder(pRoot);

        if (k <= list.size()) {
            return list.get(k - 1);
        }
        return null;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            inOrder(node.left);
        }
        list.add(node);
        if (node.right != null) {
            inOrder(node.right);
        }

    }
}
