package malehunter.datastructure.leetcode;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 给你单链表的头节点 head ，请反转链表，并返回反转后的链表。
 */

public class LeetCode206 {
    // 迭代
    public static ListNode reverseList1(ListNode head) {
        ListNode curr = head;
        ListNode dummy = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr = next;
        }
        return dummy;
    }

    // 递归
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode listNode = reverseList2(head1);
        System.out.println(listNode.val);
    }
}
