package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 11:21 下午
 */

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 234. 回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class _234isPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode i1 = head, i2 = head;
        while (i2 != null && i2.next != null) {
            i1 = i1.next;
            i2 = i2.next.next;
        }

        ListNode res = new ListNode();
        ListNode tmp;
        while (i1 != null) {
            tmp = i1.next;
            i1.next = res.next;
            res.next = i1;
            i1 = tmp;
        }

        i2 = head;
        i1 = res.next;
        while (i1 != null && i2 != null) {
            if (i1.val != i2.val ) return false;
            i1 = i1.next;
            i2 = i2.next;
        }
        return true;
    }
}
