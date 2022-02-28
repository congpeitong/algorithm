package malehunter.datastructure.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/18
 * @describe： 滑动窗口最大值
 *            给你一个整数数组 nums，有一个大小为k的滑动窗口从数组的最左侧移动到数组的最右侧。
 *            你只可以看到在滑动窗口内的 k个数字。滑动窗口每次只向右移动一位。
 *            返回 滑动窗口中的最大值 。
 */
public class LeetCode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        /**
         * 1. 堆栈内数字小于K则继续进栈，直到等于k
         * 2. 计算堆栈内的最大数字，然后出栈一个数字
         * 3. 继续进栈一个数字，比较计算栈内的最大的数字，继续出栈一个数字，进栈一个数字，直到nums数组读取完毕
         */
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            while (queue.size() < k) {
                queue.add(num);
                continue;
            }
            if (queue.size() ==  k) {

                // 计算出最大值，添加入result
            }
        }





        return null;
    }
}
