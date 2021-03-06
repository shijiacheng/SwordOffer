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
        /*NumberOf1InBinarySolution numberOf1InBinarySolution = new NumberOf1InBinarySolution();
        System.out.println(numberOf1InBinarySolution.NumberOf1(9));*/

        /* 调整数组顺序使奇数位于偶数前面 */
        /*ReOrderArraySolution reOrderArraySolution = new ReOrderArraySolution();
        int[] array = {1,2,3,4,5};
        reOrderArraySolution.reOrderArray(array);
        PrintArrayValue(array);*/

        /* 顺时针打印矩阵 */
        /*PrintMatrixSolution printMatrixSolution = new PrintMatrixSolution();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> result = printMatrixSolution.printMatrix(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }*/

        /* 栈的压入、弹出序列 */
        /*StackPushPopOrderSolution stackPushPopOrderSolution = new StackPushPopOrderSolution();
        int[] push = {1,2,3,4,5};
        int[] pop = {4,5,3,2,1};
        if (stackPushPopOrderSolution.IsPopOrder(push,pop)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

        /* 二叉搜索树的后序遍历序列 */
        /*SquenceOfBSTSolution squenceOfBSTSolution = new SquenceOfBSTSolution();
        int[] push = {5,7,6,9,11,10,8};
        if (squenceOfBSTSolution.VerifySquenceOfBST(push)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

        /* 扑克牌的顺子 */
        /*IsContinuousSolution isContinuousSolution = new IsContinuousSolution();
//        int[] array = {1,2,3,4,5};
        int[] array = {1,2,2,4,5};
//        int[] array = {0,2,0,4,5};
        if (isContinuousSolution.isContinuous(array)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

        /* 构建乘积数组 */
        /*MultiplySolution multiplySolution = new MultiplySolution();
        int[] A = {1,2,3,4,5};
        PrintArrayValue(multiplySolution.multiply(A));*/

        /* 正则表达式匹配 */
        /*RegularExpressionsMatchingSolution regularExpressionsMatchingSolution = new RegularExpressionsMatchingSolution();
        char[] str = {'a','a','a'};
        char[] pattern = {'a','.','a'};
        if (regularExpressionsMatchingSolution.match(str,pattern)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/

        /* 字符流中第一个不重复的字符 */
        /*FirstCharacterInStreamSolution firstCharacterInStreamSolution = new FirstCharacterInStreamSolution();
        char[] chars = {'g','o','o','g','l','e'};
        for (int i = 0; i < chars.length; i++) {
            firstCharacterInStreamSolution.Insert(chars[i]);
        }
        System.out.println(firstCharacterInStreamSolution.FirstAppearingOnce());*/

        /* 旋转数组的最小数字 */
        /*MinNumberInRotateArraySolution minNumberInRotateArraySolution = new MinNumberInRotateArraySolution();
        int[] array = {8, 9, 10, 1, 2, 3, 4, 5, 6 , 7};
        System.out.println(minNumberInRotateArraySolution.minNumberInRotateArray(array));*/

        /* 把数组排成最小的数 */
        SortArrayForMinNumberSolution sortArrayForMinNumberSolution = new SortArrayForMinNumberSolution();
        int[] array = {12,21};
        System.out.println(sortArrayForMinNumberSolution.PrintMinNumber(array));

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

    public static void PrintArrayValue(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
