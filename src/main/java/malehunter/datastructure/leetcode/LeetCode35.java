package malehunter.datastructure.leetcode;

/**
 * @author MaleHunter
 * @className LeetCode
 * @description 简单题
 * @date 2021-04-25 09:19
 * Version 1.0
 */
public class LeetCode35 {
    /**
     * 常规法， 挨个遍历
     * @param nums 数组
     * @param target 目标值
     * @return 目标数组位置
     */
    public int searchInsert(int nums[], int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
       return nums.length;
    }

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int nums[], int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] <  target) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return nums[left] < target ? left + 1 : left;





    }
}
