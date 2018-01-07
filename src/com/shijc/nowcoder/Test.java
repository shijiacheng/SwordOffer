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
        FindNumbersWithSumSolution findNumbersWithSumSolution = new FindNumbersWithSumSolution();
        int[] array = {1,2,3,4,5};
        ArrayList<Integer> result = findNumbersWithSumSolution.FindNumbersWithSum(array,5);
        System.out.println(result.size());
    }
}
