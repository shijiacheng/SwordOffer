package com.shijc.nowcoder;

/**
 * 数值的整数次方
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * @author shijiacheng
 * @date 2018/3/16
 */
public class PowerSolution {
    public double Power(double base, int exponent) {

        if (exponent == 0) {
            return 1;
        }
        if (base >= -0.000001 && base <= 0.000001) {
            return 0;
        }
        double mul = 1.0;
        /* 如果指数大于0 */
        if (exponent > 0) {
            for (int index = 0; index < exponent; index++) {
                mul *= base;
            }
        } else {
            exponent = -exponent;
            for (int index = 0; index < exponent; index++) {
                mul *= base;
            }
            mul = 1.0 / mul;
        }
        return mul;

    }

}

