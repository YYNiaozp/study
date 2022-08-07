package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/8 19:44
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class _19removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = new ListNode();
        slow.next = head;

        while (n-- > 0 && fast != null) {
            fast = fast.next;
        }

        if (n > 0) {
            return null;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next == head){
            return head.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
