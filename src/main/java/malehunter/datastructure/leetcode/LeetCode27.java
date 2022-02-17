package malehunter.datastructure.leetcode;
/**
 * @author congpeitong
 * @className LeetCode27
 * @description 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
                不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
                元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @date 2021-04-25 08:50
 * Version 1.0
 */
public class LeetCode27 {
    /**
     * 双指针办法 l指针找到val停下，r指针找到非va 停下，两个值交换
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            while (l < r && nums[l] != val) {
                l++;
            }
            while (l < r && nums[r] == val){
                r--;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums[l] == val ? l : l+1;
    }
}
