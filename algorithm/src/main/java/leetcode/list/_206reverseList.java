package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 11:05 下午
 */
public class _206reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode res = new ListNode();
        ListNode tmp;
        while (head != null){
            tmp = head.next;
            head.next = res.next;
            res.next = head;
            head = tmp;
        }
        return res.next;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode res = null;
        ListNode tmp;
        while (head != null){
            tmp = head.next;
            head.next = res;
            res = head;
            head = tmp;
        }
        return res;
    }
}
