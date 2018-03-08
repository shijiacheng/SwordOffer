package com.shijc.nowcoder;

/**
 * 构建乘积数组
 * 题目描述
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素
 * B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 *
 * @author shijiacheng
 * @date 2018/3/8
 */
public class MultiplySolution {
    public int[] multiply(int[] A) {

        if (A == null || A.length == 0) {
            return A;
        }

        int[] B = new int[A.length];
        int tmp1 = 1;
        int[] tmp2 = new int[A.length];
        tmp2[A.length - 1] = 1;
        for (int i = 1; i < A.length; i++) {
            tmp2[A.length - i - 1] = tmp2[A.length - i] * A[A.length - i];
        }
        for (int i = 0; i < A.length; i++) {
            if (i != 0) {
                tmp1 *= A[i - 1];
            }
            B[i] = tmp1 * tmp2[i];
        }
        return B;
    }
}
