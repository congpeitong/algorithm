package malehunter.datastructure.leetcode;
/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 链表（元素域，指针域） 单端链表，双单链表  使用场景：读少写多
 */
public class LinkedList {
    /**
     * 1. 访问 O(N)  慢
     * 2. 搜索 O(N)  慢
     * 3. 插入 O(1)  快
     * 4，删除 O(1)  快
     */
    public static void main(String[] args) {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(1);// 尾端增加
        linkedList.add(1,1); // 插入
        linkedList.indexOf(1);
        linkedList.remove(1);
        linkedList.size();
        System.out.println(linkedList.indexOf(1));
    }
}
