package com.shijc.nowcoder;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * @author shijiacheng
 * @date 2018/2/23
 */
public class PrintMatrixSolution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) {
            return null;
        }

        int rows = matrix.length;//行数
        int columns = matrix[0].length;//列数
        if (rows <= 0 || columns <= 0) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        while (columns > start * 2 && rows > start * 2) {
            printMatrixInCircle(matrix, columns, rows, start, result);
            start++;
        }

        return result;

    }

    private void printMatrixInCircle(int[][] matrix, int columns, int rows,
                                     int start, ArrayList<Integer> result) {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        //第一步：从左到右打印一行
        for (int i = start; i <= endX; i++) {
            int num = matrix[start][i];
            result.add(num);
        }

        //第二步：从上到下打印一列
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                int num = matrix[i][endX];
                result.add(num);
            }
        }

        //第三步：从右到左打印一行
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                int num = matrix[endY][i];
                result.add(num);
            }
        }

        //第四步：从下到上打印一列
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                int num = matrix[i][start];
                result.add(num);
            }
        }
    }
}
