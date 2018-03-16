package com.shijc.nowcoder;

/**
 * 求1+2+3+...+n
 * 题目描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等
 * 关键字及条件判断语句（A?B:C）。
 *
 * @author shijiacheng
 * @date 2018/3/8
 */
public class SumSolution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean temp = (sum > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }
}
