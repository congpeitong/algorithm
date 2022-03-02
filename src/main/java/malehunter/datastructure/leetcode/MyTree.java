package malehunter.datastructure.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 数据结构：树
 * 父子关系，节点: 每一个元素都是节点
 *          根节点 : 最上面的节点
 *          叶子节点:  无子节点
 * @author congpeitong
 * @date 2022-03-02 12:39
 */
public class MyTree {
    public static void main(String[] args) {
        /**
         * 树的高度:
         * 树的深度:
         * 树的层：
         * 二叉树：
         *      普通二叉树：每一个节点最多只能有两个孩子
         *      满二叉树：除了叶子节点每个节点都有左右两个孩子,所有叶子节点都在一个层上
         *      完全二叉树：从树的根节点，从上到下，从左到右依次填满节点形成的二叉树
         * 二叉树的遍历：
         *      前序遍历：根节点--->左子树----->右子树
         *      中序遍历：左子树--->根节点----->右子树
         *      后序遍历：左子树--->右子树----->根节点
         */


        /**
         * 堆: 一种二叉树，完全二叉树
         *     每个节点大于等于（最大堆）或者小于等于（最小堆）孩子节点
         *
         * 堆化：把一组无序的数加到堆里面去
         */

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
