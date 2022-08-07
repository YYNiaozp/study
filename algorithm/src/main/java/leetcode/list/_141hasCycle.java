package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 2:04 下午
 */
public class _141hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode i1 = head;
        ListNode i2 = head;

        while (i1 != null && i1.next != null) {
            i1 = i1.next.next;
            i2 = i2.next;
            if (i1 == i2)
                return true;
        }
        return false;
    }
}
