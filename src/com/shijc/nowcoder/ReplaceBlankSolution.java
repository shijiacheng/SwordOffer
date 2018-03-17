package com.shijc.nowcoder;

/**
 * 替换空格
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串
 * 为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author shijiacheng
 */
public class ReplaceBlankSolution {
    public String replaceSpace(StringBuffer str) {
        if (str != null && str.length() > 0) {
            int blankCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    blankCount++;
                }
            }
            int oldStrIndex = str.length() - 1;
            int newStrLength = str.length() + blankCount * 2;
            int newStrIndex = newStrLength - 1;

            str.setLength(newStrLength);
            while (oldStrIndex >= 0 && oldStrIndex < newStrIndex) {

                if (str.charAt(oldStrIndex) == ' ') {
                    str.setCharAt(newStrIndex--, '0');
                    str.setCharAt(newStrIndex--, '2');
                    str.setCharAt(newStrIndex--, '%');
                } else {
                    str.setCharAt(newStrIndex--, str.charAt(oldStrIndex));
                }

                oldStrIndex--;
            }


        } else {
            return "";
        }

        return str.toString();
    }
}
