package com.shijc.nowcoder;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 *
 * =============思路=================
 * 用循环不用递归，避免不必要的运算
 *
 * @author shijiacheng
 */
public class FibonacciSolution {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result = 0;
        int preNum = 1;
        int prePreNum = 0;

        for (int i = 2; i <= n; i++) {
            result = prePreNum + preNum;
            prePreNum = preNum;
            preNum = result;
        }
        return result;
    }
}
