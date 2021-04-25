package malehunter.datastructure.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author MaleHunter
 * @className LeetCode49
 * @description
 * @date 2021-04-25 10:08
 * Version 1.0
 */
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> result = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if ( !result.containsKey(key)) {
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String,ArrayList> result = new HashMap<>();
        for (String s : strs) {
            int[] count_table = new int[26];
            for (char c : s.toCharArray()) {
                count_table[c - 'a']++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int count : count_table) {
                stringBuilder.append('#');
                stringBuilder.append(count);
            }
            String key = stringBuilder.toString();
            if ( !result.containsKey(key)) {
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(s);
        }

        return new ArrayList(result.values());
    }
}
