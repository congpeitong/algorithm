package malehunter.datastructure.leetcode;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。 输入：nums = [1,1,0,1,1,1]  输出：3
 *
 *
 */
public class LeetCode485 {
    // 暴力法
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int result = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count += 1;
            }
            if (num != 1) {
                if (result < count) {
                    result = count;
                }
                count = 0;
            }
        }
        if (count > result) {
            result = count;
        }
        return result;
    }

    //
    public static int findMaxConsecutiveOnes2(int[] nums) {
        int result = 0;
        int count = 0;
        if (nums==null || nums.length == 0) {
            return 0;
        }
        for (int num : nums) {
            if (num == 1) {
                count += 1;
            } else {
                result = max(count, result);
                count = 0;

            }
        }
        return max(count,result);
    }
    public static int max(int count, int result) {
        if (result < count) {
            return count;
        } else {
            return result;
        }
    }

    // 双指针写法 for 左右相减就是1的数量
    public static int findMaxConsecutiveOnes3(int[] nums) {
        int result = 0;
        int r=0;
        int l=0;
        for (int num : nums) {
            if (num == 1) {
                r++;
                result = max(r-l,result);
            } else {
                r++;
                l = r;
            }
        }
        return result;
    }

    // 双指针写法 while
    public static int findMaxConsecutiveOnes4(int[] nums) {
        int result = 0;
        int r=0;
        int l=0;
        int lengh = nums.length;
        while (r < lengh) {
            if (nums[r] == 1) {
                r++;
                result = max(r-l,result);
            } else {
                r++;
                l = r;
            }
        }
        return result;
    }

    public static void main(String[] args) {
         int[] nums = {1,1,0,1,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes4(nums);
        System.out.println(maxConsecutiveOnes);

    }
}
