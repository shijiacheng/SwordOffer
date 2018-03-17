package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 把二叉树打印成多行
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * @author shijiacheng
 * @date 2018/3/17
 */
public class PrintTreesInLinesSolution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int start = 0;
        int end = 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            temp.add(cur.val);
            start++;
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
            if (start == end) {
                end = queue.size();
                start = 0;
                result.add(temp);
                temp = new ArrayList<>();
            }
        }

        return result;
    }
}
