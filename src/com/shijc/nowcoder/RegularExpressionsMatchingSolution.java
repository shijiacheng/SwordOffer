package com.shijc.nowcoder;

/**
 * 正则表达式匹配
 * 题目描述
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意
 * 一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹
 * 配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和
 * "ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * @author shijiacheng
 * @date 2018/3/9
 */
public class RegularExpressionsMatchingSolution {
    public boolean match(char[] str, char[] pattern) {
        int index1 = 0, index2 = 0;
        return match(str, index1, pattern, index2);
    }

    private boolean match(char[] str, int index1, char[] pattern, int index2) {
        if (index1 == str.length && index2 == pattern.length) {
            return true;
        }
        if (index1 != str.length && index2 == pattern.length) {
            return false;
        }
        if (index2 < pattern.length - 1 && pattern[index2 + 1] == '*') {
            if ((index1 < str.length) && (pattern[index2] == '.' || pattern[index2] == str[index1])) {
                return match(str, index1, pattern, index2 + 2) ||
                        match(str, index1 + 1, pattern, index2) ||
                        match(str, index1 + 1, pattern, index2 + 2);
            } else {
                return match(str, index1, pattern, index2 + 2);
            }
        } else if ((index1 < str.length) && (pattern[index2] == '.' || pattern[index2] == str[index1])) {
            return match(str, index1+1, pattern, index2 + 1);
        }
        return false;
    }


}
