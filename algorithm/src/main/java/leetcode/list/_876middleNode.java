package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/11 12:00 上午
 */
public class _876middleNode {
    public ListNode middleNode(ListNode head) {
        ListNode i1 = head, i2 = head;
        while (i2 != null && i2.next != null) {
            i1 = i1.next;
            i2 = i2.next.next;
        }
        return i1;
    }
}
