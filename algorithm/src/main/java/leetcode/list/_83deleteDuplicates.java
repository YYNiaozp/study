package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 1:48 下午
 */
public class _83deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode curr = head;
        while (curr.next != null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
