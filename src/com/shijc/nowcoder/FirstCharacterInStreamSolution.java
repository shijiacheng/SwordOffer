package com.shijc.nowcoder;

/**
 * 字符流中第一个不重复的字符
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流
 * 中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中
 * 读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 输出描述:
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 *
 * @author shijiacheng
 * @date 2018/3/10
 */
public class FirstCharacterInStreamSolution {

    private int[] count = new int[256];//初始化一个256长度的数组记录字符出现次数
    private int index = 1;//标识位

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (count[ch] == 0) {
            count[ch] = index++;
        } else {
            count[ch] = -1;
        }

    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char ch = '#';
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0 && count[i] != -1 && count[i] < temp) {
                temp = count[i];
                ch = (char) i;
            }
        }
        return ch;
    }
}
