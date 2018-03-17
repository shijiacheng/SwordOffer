package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 * 题目描述
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入
 * 数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的
 * 最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下
 * 6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 *
 * @author shijiacheng
 * @date 2018/3/17
 */
public class MaxInSlidingWindowSolution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || num.length == 0 || size == 0) {
            return result;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            if (queue.isEmpty()) {
                queue.addLast(i);
            } else {
                if (num[i] <= num[queue.getLast()]) {
                    queue.addLast(i);
                } else {
                    while (!queue.isEmpty() && num[i] > num[queue.getLast()]) {
                        queue.removeLast();
                    }
                    queue.addLast(i);
                }
            }
            if (i + 1 >= size) {
                int first = queue.getFirst();
                while ((i - first) > size - 1) {
                    queue.removeFirst();
                    first = queue.getFirst();
                }
                result.add(num[first]);
            }
        }

        return result;
    }
}
