package malehunter.datastructure.leetcode;
/**
 * @author MaleHunter
 * @className LeetCode27
 * @description 简单题
 * @date 2021-04-25 08:50
 * Version 1.0
 */
public class LeetCode27 {
    /**
     * 双指针办法
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
    static void swap(int nums1, int nums2){
        nums1 = nums1 + nums2;
        nums2 = nums1 - nums2;
        nums1 = nums1 - nums2;
    }
}
