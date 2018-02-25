package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉树中和为某一值的路径
 * 题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * @author shijiacheng
 * @date 2018/2/25
 */
public class PathInTreeSolution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        int currentSum = 0;
        Stack<Integer> stack = new Stack<>();
        findPath(root, target, stack, currentSum, result);
        return result;
    }

    private void findPath(TreeNode root, int target, Stack<Integer> stack, int currentSum,
                          ArrayList<ArrayList<Integer>> result) {

        currentSum += root.val;
        stack.push(root.val);
        boolean isLeaf = root.left == null && root.right == null;
        if (currentSum == target && isLeaf) {
            ArrayList<Integer> path = new ArrayList<>();
            for (Integer x : stack) {
                path.add(x);
            }
            result.add(path);

        }
        if (root.left != null) {
            findPath(root.left, target, stack, currentSum, result);
        }
        if (root.right != null) {
            findPath(root.right, target, stack, currentSum, result);
        }

        currentSum = currentSum - root.val;
        stack.pop();
    }
}
