package malehunter.datastructure.leetcode;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author congp
 * @className LeetCode496
 * @description
 * @date 2022-02-28 12:42
 * Version 1.0
 */
public class LeetCode496 {
    /**
     * 通过两个栈实现
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        boolean isFound = false;
        int max = -1;
        for (int i : nums2) {
            stack.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            while (stack.size() != 0 && !isFound) {
                Integer top = stack.pop();
                if (top > nums1[i]) {
                    max = top;
                } else if (top == nums1[i]) {
                    isFound = true;
                } else {
                }
                temp.push(top);
            }
            result[i] = max;
            max = -1;
            isFound = false;
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return result;
    }

    /**
     * 栈+哈希表  哈希表内存储下一个更大的值  key：值  value:key的下一个更大的值（可以通过栈来计算下一个更大的值） 最后直接通过hashTable的key查询到它对应的下一个最大的值
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (stack.size()!=0 && num > stack.peek()) {
                Integer pop = stack.pop();
                map.put(pop,num);
            }
            stack.add(num);
        }
        while (stack.size() != 0) {
            Integer pop = stack.pop();
            map.put(pop,-1);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        int[] ints = nextGreaterElement2(num1, num2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
