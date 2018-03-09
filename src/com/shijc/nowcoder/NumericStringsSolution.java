package com.shijc.nowcoder;

/**
 * 表示数值的字符串
 * 题目描述
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100",
 * "5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3",
 * "+-5"和"12e+4.3"都不是。
 *
 * @author shijiacheng
 * @date 2018/3/9
 */
public class NumericStringsSolution {
    /**
     * 对字符串中的每个字符进行判断分析
     * e（E）后面只能接数字，并且不能出现2次
     * 对于+、-号，只能出现在第一个字符或者是e的后一位
     * 对于小数点，不能出现2次，e后面不能出现小数点
     *
     * @param str
     * @return
     */
    public boolean isNumeric(char[] str) {

        boolean sign = false;//符号位
        boolean point = false;//是否有小数点
        boolean hasE = false;//是否有字母e

        for (int i = 0; i < str.length; i++) {

            if (str[i] == 'e' || str[i] == 'E') {
                if (i == str.length - 1) {
                    return false;
                }
                if (hasE) {
                    return false;
                }
                hasE = true;
            } else if (str[i] == '+' || str[i] == '-') {
                if (sign && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E') {
                    return false;
                }
                sign = true;
            } else if (str[i] == '.') {
                if (hasE || point) return false;
                point = true;
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
