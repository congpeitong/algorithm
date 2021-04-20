package malehunter.datastructure.leetcode;

/**
 * ClassName ListNode
 * Description java链表数据结构
 * @author MaleHunter
 * Date 2021-04-20 10:40
 * Version 1.0
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(){};
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
