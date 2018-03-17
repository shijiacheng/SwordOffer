package com.shijc.nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 * 题目描述
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 *
 * @author shijiacheng
 * @date 2018/3/14
 */
public class FirstNotRepeatingCharSolution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
