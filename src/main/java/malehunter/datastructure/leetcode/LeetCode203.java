package malehunter.datastructure.leetcode;

import java.util.LinkedList;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class LeetCode203 {
    // 方法一：迭代
    public ListNode removeElements1(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return dummy.next;
    }

    // 方法二：递归

    /**
     * 对于给定的链表，首先对除了头节点head 以外的节点进行删除操作，然后判断head 的节点值是否等于给定的val。如果head 的节点值等于val，
     * 则 head 需要被删除，
     * 因此删除操作后的头节点为head.next；如果head 的节点值不等于val，则head保留，因此删除操作后的头节点还是head。上述过程是一个递归的过程。
     * 递归的终止条件是head 为空，此时直接返回head。当head 不为空时，递归地进行删除操作，然后判断head的节点值是否等于val并决定是否要删除head。
     */
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements2(head.next, val);
        return head.val==val?head.next:head;
    }

}
