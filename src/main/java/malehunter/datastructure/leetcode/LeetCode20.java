package malehunter.datastructure.leetcode;
import java.util.Stack;
/**
 * ClassName LeetCode20
 * Description 有效括号的问题
 * @autor MaleHunter
 * Date 2021-04-20 11:17
 * Version 1.0
 */
public class LeetCode20 {
    /**\
     * 使用栈的特性先入后出解决括号问题
     * @param s 所给括号的字符串
     * @return 所给定的字符串是否是括号匹配的
     */
    public boolean isValid(String s){
        if (s.length() == 0){
            return true;
        }
        Stack stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else  {
                if (stack.isEmpty()) {
                    return false;
                } else  {
                    char temp = (char) stack.pop();
                    if (ch == ')'){
                        if (temp != '('){
                            return false;
                        }
                    } else if (ch == '}') {
                        if (temp != '{') {
                            return false;
                        }
                    } else if (ch == ']') {
                        if (temp != '['){
                            return false;
                        }
                    }
                }
            }
        }
       return stack.isEmpty() ? true : false;
    }
}
