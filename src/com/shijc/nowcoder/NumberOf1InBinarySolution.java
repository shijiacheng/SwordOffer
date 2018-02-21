package com.shijc.nowcoder;

/**
 * 二进制中1的个数
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * input 9
 * output 2
 *
 * @author shijiacheng
 * @date 2018/2/21
 */
public class NumberOf1InBinarySolution {
    /**
     * 思路，将原来的数减1然后做位与运算，得到的结果相当于把原来整数的二进制中最右边的1变为0；
     *
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;

    }
}
