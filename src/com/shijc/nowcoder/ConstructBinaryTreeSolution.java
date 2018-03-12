package com.shijc.nowcoder;

/**
 * 重建二叉树
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和
 * 中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中
 * 序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * @author shijiacheng
 * @date 2018/3/12
 */
public class ConstructBinaryTreeSolution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = null;
        root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;

    }

    private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd,
                                           int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        int i = 0;
        for (i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {

                break;
            }
        }

        if (preStart < preEnd && inStart < inEnd) {
            root.left = reConstructBinaryTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
            root.right = reConstructBinaryTree(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);//右子树
        }

        return root;
    }
}
