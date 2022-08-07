package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 2:18 下午
 */
public class _142detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode i1 = head;
        ListNode i2 = head;

        while (i1 != null && i1.next != null) {
            i1 = i1.next.next;
            i2 = i2.next;
            if (i1 == i2){
                i1 = head;
                while (i1 != i2){
                    i1 = i1.next;
                    i2 = i2.next;
                }
                return i1;
            }

        }
        return null;
    }
}
