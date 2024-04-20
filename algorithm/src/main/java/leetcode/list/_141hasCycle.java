package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 2:04 下午
 */

/**
 * 141. 环形链表
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * <p>
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
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
