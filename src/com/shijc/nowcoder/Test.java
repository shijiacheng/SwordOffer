package com.shijc.nowcoder;

import java.util.ArrayList;

/**
 * 测试类
 *
 * @author shijiacheng
 */
public class Test {
    public static void main(String[] args) {

        /* 斐波那契数列 */
        /*FibonacciSolution fibonacciSolution = new FibonacciSolution();
        System.out.println(fibonacciSolution.Fibonacci(30));*/

        /* 跳台阶 */
        /*JumpFloorSolution jumpFloorSolution = new JumpFloorSolution();
        System.out.println(jumpFloorSolution.JumpFloor(30));*/

        /* 变态跳台阶 */
        /*JumpFloorIISolution jumpFloorIISolution = new JumpFloorIISolution();
        System.out.println(jumpFloorIISolution.JumpFloorII(30));*/

        /* 和为S的连续正数序列 */
        /*FindContinuousSequenceSolution findContinuousSequenceSolution = new FindContinuousSequenceSolution();
        ArrayList<ArrayList<Integer>> result = findContinuousSequenceSolution.FindContinuousSequence(100);
        System.out.println(result.size());*/

        /* 和为S的两个数字 */
        /*FindNumbersWithSumSolution findNumbersWithSumSolution = new FindNumbersWithSumSolution();
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> result = findNumbersWithSumSolution.FindNumbersWithSum(array,5);
        System.out.println(result.size());*/

        /* 翻转单词顺序列 */
        /*ReverseSentenceSolution reverseSentenceSolution = new ReverseSentenceSolution();
        System.out.println(reverseSentenceSolution.ReverseSentence("I am a student."));*/

        /* 左旋转字符串 */
        /*LeftRotateStringSolution leftRotateStringSolution = new LeftRotateStringSolution();
        System.out.println(leftRotateStringSolution.LeftRotateString("abcXYZdef",3));*/

        /* 字符串的排列 */
        /*PermutationSolution permutationSolution = new PermutationSolution();
        PrintListValue(permutationSolution.Permutation("abc"));*/

        /* 数组中出现次数超过一半的数字 */
        /*MoreThanHalfNumSolution moreThanHalfNumSolution = new MoreThanHalfNumSolution();
        int[] array = {1,2,3,3,3,3,3,4,5};
        System.out.println(moreThanHalfNumSolution.MoreThanHalfNum_Solution(array));*/

        /* 不用加减乘除做加法 */
        /*AddWithoutOperatorSolution addWithoutOperatorSolution = new AddWithoutOperatorSolution();
        System.out.println(addWithoutOperatorSolution.Add(4,5));*/

        /* 把字符串转换成整数 */
        /*StringToIntSolution stringToIntSolution = new StringToIntSolution();
        System.out.println(stringToIntSolution.StrToInt("-9382373"));*/

        /* 数组中重复的数字 */
        /*DuplicateInArraySolution duplicateInArraySolution = new DuplicateInArraySolution();
        int[] numbers = {2,3,1,0,2,5,3};
        int length = 7;
        int[] array = new int[1];
        boolean result = duplicateInArraySolution.duplicate(numbers,length,array);
        if (result){
            System.out.println(array[0]);
        }else {
            System.out.println("false");
        }*/

        /* 二进制中1的个数 */
        NumberOf1InBinarySolution numberOf1InBinarySolution = new NumberOf1InBinarySolution();
        System.out.println(numberOf1InBinarySolution.NumberOf1(9));


    }


    /**
     * 【公共方法】
     *
     * 打印数组的值
     * @param result
     */
    public static void PrintListValue(ArrayList<String> result){
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }
    }
}
