package malehunter.datastructure.leetcode;

/**
 * @author MaleHunter
 * @className LeetCode24
 * @description
 * @date 2021-04-24 16:48
 * Version 1.0
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode current = result;
        while (current.next != null && current.next.next != null){
            ListNode next = head.next;
            ListNode temp = head.next.next;
            current.next = next;
            next.next = head;
            head.next = temp;
            current = head;
            head = head.next;
        }
        return result.next;
    }

    public ListNode swapPairs2(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs2(head.next.next);
        next.next = head;
        return next;
    }
}
