package malehunter.datastructure.leetcode;

/**
 * @author MaleHunter
 * @className LeetCode21
 * @description leetcode21题
 * @date 2021-04-21 11:29
 * Version 1.0
 */
public class LeetCode21 {
    /**
     * 迭代法
     * @param l1  有序链表
     * @param l2  有序链表
     * @return    合并的有序链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else  {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 == null) {
            current.next = l2;
        }
        if (l2 == null ) {
            current.next = l1;
        }
        return result.next;
    }

    /**
     * 递归法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1,l2.next);
            return l2;
        }

    }
}
