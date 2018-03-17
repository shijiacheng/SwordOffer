package com.shijc.nowcoder;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的排列
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 *
 * @author shijiacheng
 */
public class PermutationSolution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        PermutationUtils(str.toCharArray(), 0, result);
        Collections.sort(result);
        return result;
    }


    public void PermutationUtils(char[] chars, int start, ArrayList list) {
        if (start == chars.length - 1) {
            String str = String.valueOf(chars);
            if (!list.contains(str)) {
                list.add(str);
            }
        } else {
            for (int i = start; i < chars.length; i++) {
                swap(chars, start, i);
                PermutationUtils(chars, start + 1, list);
                swap(chars, start, i);


            }
        }
    }

    private void swap(char[] chars, int start, int end) {
        char temp = chars[end];
        chars[end] = chars[start];
        chars[start] = temp;
    }
}
