package com.shijc.nowcoder;

/**
 * 丑数
 * 题目描述
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小
 * 到大的顺序的第N个丑数。
 *
 * @author shijiacheng
 * @date 2018/3/13
 */
public class UglyNumberSolution {
    public int GetUglyNumber_Solution(int index) {

        if (index <= 0) {
            return 0;
        }

        int[] uglyNumbers = new int[index];
        uglyNumbers[0] = 1;
        int nextUglyNumIndex = 1;//下一个丑数索引
        int multNumber2 = 0;
        int multNumber3 = 0;
        int multNumber5 = 0;

        while (nextUglyNumIndex < index) {
            int min = min(uglyNumbers[multNumber2] * 2,
                    uglyNumbers[multNumber3] * 3,
                    uglyNumbers[multNumber5] * 5);

            uglyNumbers[nextUglyNumIndex] = min;
            if (uglyNumbers[multNumber2] * 2 == min) {
                multNumber2++;
            }
            if (uglyNumbers[multNumber3] * 3 == min) {
                multNumber3++;
            }
            if (uglyNumbers[multNumber5] * 5 == min) {
                multNumber5++;
            }

            nextUglyNumIndex++;
        }

        return uglyNumbers[nextUglyNumIndex - 1];

    }

    private int min(int num1, int num2, int num3) {
        int min = num1 > num2 ? num2 : num1;
        min = min > num3 ? num3 : min;
        return min;
    }
}
