package com.shijc.nowcoder;

/**
 * 连续子数组的最大和
 * 题目描述
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
 * 他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向
 * 量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某
 * 个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连
 * 续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？
 * (子向量的长度至少是1)
 *
 * @author shijiacheng
 * @date 2018/3/13
 */
public class GreatestSumOfSubArraysSolution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null) {
            return -1;
        }
        int max = Integer.MIN_VALUE, sum = max;
        for (int i = 0; i < array.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += array[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
