package malehunter.datastructure.leetcode;
import java.util.HashMap;
/**
 * classname leetcode1
 * Description leetcode第一题   暴力法和哈希表法
 * Autor MaleHunter
 * Date 2021-04-19 21:19
 * Version 1.0
 * @author malehunter
 */
public class LeetCode1 {
    /**
     * 暴力法求
     * @param nums 所给的数组
     * @param target  目标值
     * @return  索引的返回数组
     */
    public int[] twoSum(int[] nums,int target){
       int[] result = new int[2];
       for (int i = 0; i<nums.length; i++) {
           for (int j = i+1; j<nums.length; j++) {
               int sum = nums[i] + nums[j];
               if (sum == target) {
                   result[0] = i;
                   result[1] = j;
                   return result;
               }
           }
       }
        return result;
    }

    /**
     * 哈希表法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int j=0; j<nums.length; j++) {
            int middlesum = target - nums[j];
            if (map.containsKey(middlesum) && map.get(middlesum) != j){
                result[0] = j;
                result[1] = map.get(middlesum);
                return result;
            }
        }
        return result;
    }


}
