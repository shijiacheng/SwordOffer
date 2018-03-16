package com.shijc.nowcoder;

/**
 * 序列化二叉树
 * 题目描述
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 *
 * @author shijiacheng
 * @date 2018/3/16
 */
public class SerializeBinaryTreeSolution {
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root==null){
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();

    }

    int p = -1;
    TreeNode Deserialize(String str) {
        p++;
        if (p >= str.length())
            return null;
        TreeNode node = null;
        String[] strArray = str.split(",");
        if (!strArray[p].equals("#")) {
            node = new TreeNode(Integer.valueOf(strArray[p]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;

    }
}
