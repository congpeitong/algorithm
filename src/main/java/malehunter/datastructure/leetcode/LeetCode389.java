package malehunter.datastructure.leetcode;

/**
 * @author congpeitong
 * @date 2022-02-28 15:13
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 */
public class LeetCode389 {
    /**
     * s出现的次数减一，t出现的次数加一，相加小于零的为找出来的字符
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int[] ints = new int[26];
        for (int i=0; i<s.length(); i++) {
            char charAt = s.charAt(i);
            ints[charAt - 'a']++;
        }
        for (int i=0; i<t.length(); i++) {
            char charAt = t.charAt(i);
            ints[charAt - 'a']--;
            if (ints[charAt - 'a'] < 0) {
                return charAt;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println('b'-'a');
    }
}
