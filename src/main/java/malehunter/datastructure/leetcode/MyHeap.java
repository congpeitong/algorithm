package malehunter.datastructure.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author congpeitong
 * @date 2022-03-16 14:34
 */
public class MyHeap {
    /**
     * 堆: 一种二叉树，完全二叉树
     *     每个节点大于等于（最大堆）或者小于等于（最小堆）孩子节点
     *
     * 堆化：把一组无序的数加到堆里面去
     */
    public static void main(String[] args) {
        // create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // add element
        minHeap.add(2);
        minHeap.add(10);
        minHeap.add(4);
        maxHeap.add(4);
        maxHeap.add(10);
        maxHeap.add(2);
        System.out.println(minHeap.toString());
        System.out.println(maxHeap);
        // peek a element
        minHeap.peek();
        // delete a top element
        minHeap.poll();
        // heap size
        minHeap.size();
        // iteration
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

    }
}
