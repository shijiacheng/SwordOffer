package com.shijc.nowcoder;

/**
 * 把字符串转换成整数
 * 题目描述
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 示例1
 * 输入
 * +2147483647
 * 1a33
 * 输出
 * 2147483647
 * 0
 *
 * @author shijiacheng
 * @date 2018/2/17
 */
public class StringToIntSolution {
    public int StrToInt(String str) {
        if (str.length()==0){
            return 0;
        }else if (str.length() == 1&&(str.charAt(0)=='-' ||str.charAt(0)=='+' )){
            return 0;
        }else {
            int flag = 0;//1是整数，2是负数
            boolean error = false;
            char[] chars = str.toCharArray();
            int i = 0;
            if (chars[0]=='-'){
                i++;
                flag= 2;
            }else if (chars[0]=='+'){
                i++;
                flag= 1;
            }

            int result = 0;
            for (int j = i; j < chars.length; j++) {


                if (chars[j]>='0'&&chars[j]<='9'){
                    result = result*10+(chars[j]-'0');
                }else {
                    error = true;
                    break;
                }
            }

            if (!error){
                if (flag==2){
                    result = result*(-1);
                }
                return result;
            }else {
                return 0;
            }
        }
    }

}
