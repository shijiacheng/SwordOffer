package com.shijc.nowcoder;

/**
 * 对称的二叉树
 * 题目描述
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的
 * 镜像是同样的，定义其为对称的。
 *
 * @author shijiacheng
 * @date 2018/3/11
 */
public class SymmetricalBinaryTreeSolution {
    boolean isSymmetrical(TreeNode pRoot) {
        return isSymmetrical(pRoot, pRoot);
    }

    private boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }
        if (pRoot1.val != pRoot2.val) {
            return false;
        }

        return isSymmetrical(pRoot1.left, pRoot2.right)
                && isSymmetrical(pRoot1.right, pRoot2.left);
    }
}
