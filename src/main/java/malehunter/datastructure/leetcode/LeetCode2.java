package malehunter.datastructure.leetcode;

import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverLocalFilesystem;

/**
 * ClassName LeetCode2
 * Description 两数相加，链表形式的数值
 *
 * @autor MaleHunter
 * Date 2021-04-20 10:22
 * Version 1.0
 */
public class LeetCode2 {
    /**
     * 迭代法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        // 本次进位的数值
        int next1 = 0;
        // 当前两数相加的数值
        int total = 0;
        // 结果链表
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (l1 != null && l2 != null){
            total = l1.val + l2.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        while (l1 != null) {
            total = l1.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null){
            total = l2.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10;
            l2 = l2.next;
            cur = cur.next;
        }
        if (next1 != 0) {
            cur.next = new ListNode(next1);
        }
        return dummy.next;
    }

    /**
     * 递归法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1,ListNode l2){
        int total = l1.val + l2.val;
        int next1 = total / 10;
        ListNode result = new ListNode(total % 10);
        if (l1.next != null || l2.next !=null || next1 !=  0) {
            // l1走完是否补上零
            l1 = l1.next != null ? l1.next : new ListNode(0);
            // l2 走完是否补上零
            l2 = l2.next != null ? l2.next : new ListNode(0);
            // 若是两数之和大于10的数，将 1 加到 l1 的下一个节点上
            l1.val += next1;
            result.next = addTwoNumbers2(l1,l2);
        }
        return result;
    }


}
