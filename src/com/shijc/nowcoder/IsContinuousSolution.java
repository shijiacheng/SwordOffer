package com.shijc.nowcoder;

import java.util.Arrays;

/**
 * 扑克牌的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2~10是数字本身，
 * A是0，J为11，Q为12，K为13，而大小王可以k看成任意数字。
 *
 * @author shijiacheng
 * @date 2018/3/7
 */
public class IsContinuousSolution {
    /**
     * 大小王是万能牌，我们把大小王记为0；判断0的个数是不是比间隔总和少
     * @param numbers
     * @return
     */
    public boolean isContinuous(int [] numbers) {
        if (numbers==null || numbers.length<1){
            return false;
        }
        int length = numbers.length;
        int zeroCount = 0;
        int blankCount = 0;//间隔的总数

        //采用系统排序，因为只有5个数，效率不会低
        Arrays.sort(numbers);

        for (int i = 0; i <length && numbers[i]==0; i++) {
            zeroCount++;
        }

        int pre = zeroCount;//左边的数
        int next = zeroCount+1;

        while (next<length){
            if (numbers[pre]==numbers[next]){
                return false;//两个数一样，至少是对子
            }

            blankCount+=numbers[next]-numbers[pre]-1;

            pre = next;
            next++;
        }

        return blankCount>zeroCount?false:true;

    }
}
