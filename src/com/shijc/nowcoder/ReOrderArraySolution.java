package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * @author shijiacheng
 * @date 2018/2/21
 */
public class ReOrderArraySolution {
    public void reOrderArray(int[] array) {
        List<Integer> jishu = new ArrayList<>();
        List<Integer> oushu = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                oushu.add(array[i]);
            } else {
                jishu.add(array[i]);
            }
        }
        jishu.addAll(oushu);
        for (int i = 0; i < jishu.size(); i++) {
            array[i] = jishu.get(i);
        }
    }
}
