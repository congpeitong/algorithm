package malehunter.datastructure.leetcode;

/**
 * @author congp
 * @className Stack
 * @description 栈的使用
 * @date 2022-02-28 12:35
 * Version 1.0
 */
public class Stack {
    /**
     * 特点： 先进后出
     */
    public static void main(String[] args) {
        // 创建栈
        java.util.Stack<Integer> strings = new java.util.Stack<>();
        // 添加元素
        strings.push(1);
        strings.push(2);
        strings.push(3);
        // 获取栈顶元素
        Integer peek = strings.peek();
        // 删除栈顶元素
        Integer pop = strings.pop();
        // 栈的大小
        int size = strings.size();
        // 栈是否为空
        boolean empty = strings.isEmpty();
        // 栈的遍历（边删除边遍历）
        while (!strings.isEmpty()) {
            Integer pop1 = strings.pop();
            System.out.println(pop1);
        }






    }
}
