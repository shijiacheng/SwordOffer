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
        MoreThanHalfNumSolution moreThanHalfNumSolution = new MoreThanHalfNumSolution();
        int[] array = {1,2,3,3,3,3,3,4,5};
        System.out.println(moreThanHalfNumSolution.MoreThanHalfNum_Solution(array));


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
