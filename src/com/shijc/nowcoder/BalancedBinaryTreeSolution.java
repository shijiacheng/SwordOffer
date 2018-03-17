package com.shijc.nowcoder;

/**
 * 平衡二叉树
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * @author shijiacheng
 * @date 2018/3/14
 */
public class BalancedBinaryTreeSolution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        if (leftHeight - rightHeight > 1 || leftHeight - rightHeight < -1)
            return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }


    private int getTreeHeight(TreeNode root) {
        if (root == null) return 0;
        int leftLen = getTreeHeight(root.left);
        int rightLen = getTreeHeight(root.right);
        return leftLen > rightLen ? leftLen + 1 : rightLen + 1;
    }
}
