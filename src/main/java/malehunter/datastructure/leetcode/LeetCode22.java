package malehunter.datastructure.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MaleHunter
 * @className LeetCode22
 * @description
 * @date 2021-04-21 12:22
 * Version 1.0
 */
public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
       List<String> result = new ArrayList<>();
       backtracking(n,result,0,0,"");
        return result;

    }
    public void backtracking(int n, List<String> result, int left, int right, String str) {
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        if (left < n) {
            backtracking(n, result, left + 1, right, str + "(");
        }
        if (right < left) {
            backtracking(n, result, left, right + 1, str + ")");

        }
    }

}
