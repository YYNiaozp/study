package leetcode.list;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/10 1:14 下午
 */
public class _21mergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode lastN = res;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                lastN.next = list1;
                lastN = list1;
                list1 = list1.next;
            } else {
                lastN.next = list2;
                lastN = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            lastN.next = list1;
        }
        if (list2 != null) {
            lastN.next = list2;
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
