package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/8 19:31
 */

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class _2addTwoNumbers {
    //perfect
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int i = 0;
        while (l1 != null || l2 != null) {
            int j = i;
            if (l1 != null) {
                j += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                j += l2.val;
                l2 = l2.next;
            }
            i = j / 10; //进位
            tail.next = new ListNode(j % 10);   //保留余数，构造节点
            tail = tail.next;
        }
        if (i != 0) {
            tail.next = new ListNode(i);
        }
        return head.next;
    }

    @Deprecated
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int i = 0;
        while (l1 != null && l2 != null) {
            int j = l1.val + l2.val + i;
            i = j / 10;
            tail.next = new ListNode(j % 10);
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int j = l1.val + i;
            i = j / 10;
            tail.next = new ListNode(j % 10);
            tail = tail.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int j = l2.val + i;
            i = j / 10;
            tail.next = new ListNode(j % 10);
            tail = tail.next;
            l2 = l2.next;
        }
        if (i != 0) {
            tail.next = new ListNode(i);
        }
        return head.next;
    }
}
