package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 把数组排成最小的数
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的
 * 所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能
 * 排成的最小数字为321323。
 *
 * @author shijiacheng
 * @date 2018/3/13
 */
public class SortArrayForMinNumberSolution {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();

    }
}
