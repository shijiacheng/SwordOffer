package com.shijc.nowcoder;

import java.util.ArrayList;

/**
 * 最小的K个数
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * Created by lzx-t006 on 2018/3/13.
 */
public class KLeastNumbersSolution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length <= 0 || k <= 0 || k > input.length) {
            return list;
        }

        int low = 0;
        int high = input.length - 1;
        int index = Partition(input, k, low, high);
        while (index != k-1) {
            if (index > k - 1) {
                high = index - 1;
                index = Partition(input, k, low, high);
            } else {
                low = index + 1;
                index = Partition(input, k, low, high);
            }
        }

        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }

        return list;
    }

    private int Partition(int[] input, int k, int low, int high) {
        int pivokey = input[k - 1];
        swap(input, k - 1, low);
        while (low < high) {
            while (low < high && input[high] >= pivokey) {
                high--;
            }
            swap(input, low, high);
            while (low < high && input[low] <= pivokey) {
                low++;
            }
            swap(input, low, high);
        }
        return low;
    }

    private void swap(int[] input, int low, int high) {
        int temp = input[high];
        input[high] = input[low];
        input[low] = temp;
    }
}
