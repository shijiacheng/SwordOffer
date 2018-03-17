package com.shijc.nowcoder;

/**
 * 二维数组中的查找
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author shijiacheng
 */
public class FindInSortedMatrixSolution {
    public boolean Find(int target, int[][] array) {
        boolean result = false;
        if (array != null) {
            int rows = array.length - 1;
            int cols = array[0].length - 1;

            int row = 0;
            int col = cols;
            while (row <= rows && col >= 0) {
                if (array[row][col] == target) {
                    return true;
                } else if (array[row][col] > target) {
                    col--;
                } else {
                    row++;
                }
            }
        }

        return result;
    }
}
