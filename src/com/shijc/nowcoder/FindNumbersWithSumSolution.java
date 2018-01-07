package com.shijc.nowcoder;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 *
 * @author shijiacheng
 */
public class FindNumbersWithSumSolution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> totalResult = new ArrayList<>();
        if (array.length < 1) {
            return result;
        }
        int small = 0;
        int big = array.length - 1;
        while (big > small) {
            int curSum = array[small] + array[big];
            if (curSum == sum) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(array[small]);
                temp.add(array[big]);
                totalResult.add(temp);
                big--;
            } else if (curSum > sum) {
                big--;
            } else {
                small++;
            }
        }

        if (totalResult.size() > 0) {
            int number = Integer.MAX_VALUE;
            for (int i = 0; i < totalResult.size(); i++) {
                int temp = totalResult.get(i).get(0) * totalResult.get(i).get(1);
                if (number > temp) {
                    number = temp;
                    result.clear();
                    result.add(totalResult.get(i).get(0));
                    result.add(totalResult.get(i).get(1));
                }
            }
        }

        return result;
    }
}
