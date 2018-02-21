package com.shijc.nowcoder;

/**
 * 矩形覆盖
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地
 * 覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * @author shijiacheng
 * @date 2018/2/21
 */
public class RectCoverSolution {
    /**
     * 思路：假设用8个2*1的矩形覆盖2*8的大矩形，先把2*8的覆盖方法记为f(8)，用第一个2*1的小矩形
     * 覆盖大矩形最左边的时候有横着放竖着放两种选择，竖着放的时候右边还剩2*7，这时覆盖方法是f(7)，
     * 横着放的时候，最左边还要横着放一个，右边还剩2*6，这时覆盖方法记为f(6),f(8)=f(7)+f(6),
     * 还是斐波那切数列。
     */
    public int RectCover(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int result = 0;
        int prePreNum = 1;
        int preNum = 2;
        for (int i = 3; i <= target; i++) {
            result = prePreNum + preNum;
            prePreNum = preNum;
            preNum = result;
        }
        return result;
    }
}
