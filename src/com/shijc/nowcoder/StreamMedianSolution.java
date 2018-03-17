package com.shijc.nowcoder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 * 题目描述
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是
 * 所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就
 * 是所有数值排序之后中间两个数的平均值。
 *
 * @author shijiacheng
 * @date 2018/3/16
 */
public class StreamMedianSolution {
    int count = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        count++;
        if (count % 2 == 0) {
            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        } else {
            if (!minHeap.isEmpty() && num > minHeap.peek()) {
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {
        if (count == 0) {
            return 0.0;
        }
        if (count % 2 == 0) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek() * 1.0;
        }
    }

}
