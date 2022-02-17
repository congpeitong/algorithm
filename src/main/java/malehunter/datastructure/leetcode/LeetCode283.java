package malehunter.datastructure.leetcode;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class LeetCode283 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        for (int i=index; i < nums.length;i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {

    }
}
