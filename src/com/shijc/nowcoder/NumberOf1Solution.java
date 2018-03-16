package com.shijc.nowcoder;

/**
 * 整数中1出现的次数（从1到n整数中1出现的次数）
 * 题目描述
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出
 * 现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更
 * 加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 *
 * @author shijiacheng
 * @date 2018/3/16.
 */
public class NumberOf1Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i, b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;
    }
}
