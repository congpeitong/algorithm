package malehunter.datastructure.leetcode;

import java.util.LinkedList;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/18
 * @describe： 队列知识点
 */
public class Queue {
    /**
     * 特点：和按顺序排队一个概念，先到先得先入先出
     *      一端入队，一端出队
     *      单端队列：只有一个口可以进，一个口可以出
     *      双端队列：左右两口都可以进，都可以出
     *
     * 时间复杂度：
     *      访问：O(N)
     *      搜索：O(N)
     *      插入：O(1)
     *      删除: O(1)
     * 队列的常用操作：
     *      1. 创建队列
     *      2. 添加元素
     *      3. 获取即将出队的元素
     *      4. 删除即将出队的元素
     *      5. 判断队列是否为空
     *      6. 队列长度
     *      7. 遍历队列（边删除，边遍历操作)
     */
    public static void main(String[] args) {

        // 创建队列
        java.util.Queue<Integer> queue = new LinkedList<>();
        // 添加元素
        boolean add2 = queue.add(1);
        boolean add1 = queue.add(2);
        boolean add = queue.add(3);
        // 获取元素,获取即将出队的元素
        queue.peek();
        // 删除元素， 删除即将出队的元素
        Integer poll = queue.poll();
        Integer remove = queue.remove();
        // 判断队列是否为空,返回 true/false
        boolean empty = queue.isEmpty();
        // 队列长度
        int size = queue.size();
        // 遍历队列 (边遍历，边删除)
        while (!queue.isEmpty()) {
            Integer temp = queue.poll();
        }
    }
}
