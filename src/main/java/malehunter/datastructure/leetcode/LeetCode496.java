package malehunter.datastructure.leetcode;

import java.util.ArrayList;
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

    @Deprecated
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            map.put(nums2[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        int[] ints = nextGreaterElement1(num1, num2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
