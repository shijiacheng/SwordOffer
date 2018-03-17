package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 按之字形顺序打印二叉树
 * 题目描述
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行
 * 以此类推。
 *
 * @author shijiacheng
 * @date 2018/3/17
 */
public class PrintTreesInZigzagSolution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot == null) {
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(pRoot.val);
        result.add(list);

        stack1.push(pRoot);

        while (stack1.isEmpty() || stack2.isEmpty()) {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                break;
            }

            ArrayList<Integer> temp = new ArrayList<>();
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    if (stack1.peek().right != null) {
                        temp.add(stack1.peek().right.val);
                        stack2.push(stack1.peek().right);
                    }
                    if (stack1.peek().left != null) {
                        temp.add(stack1.peek().left.val);
                        stack2.push(stack1.peek().left);
                    }

                    stack1.pop();
                }
            } else {
                while (!stack2.isEmpty()) {
                    if (stack2.peek().left != null) {
                        temp.add(stack2.peek().left.val);
                        stack1.push(stack2.peek().left);
                    }
                    if (stack2.peek().right != null) {
                        temp.add(stack2.peek().right.val);
                        stack1.push(stack2.peek().right);
                    }
                    stack2.pop();
                }
            }
            if (temp.size() > 0) {
                result.add(temp);
            }

        }

        return result;
    }
}
