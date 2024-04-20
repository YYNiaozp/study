package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/8 19:44
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class _19removeNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = new ListNode();
        slow.next = head;

        while (n > 0 && fast != null) { //快指针先行
            fast = fast.next;
            n--;
        }

        if (n > 0) {    //1链表太短
            return null;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow.next == head) {    //2删除头节点
            return head.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        removeNthFromEnd(new ListNode(1, null), 1);
    }
}
