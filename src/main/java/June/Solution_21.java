package June;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangdanjin
 * @Date: 2020/6/23 13:48
 */
public class Solution_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        if (l1 == null && l2 == null) {
            return listNode.next;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            listNode.next = new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        } else {
            listNode.next = new ListNode(l2.val, mergeTwoLists(l1, l2.next));
        }

        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        Solution_21 solution_21 = new Solution_21();
        ListNode listNode = solution_21.mergeTwoLists(l1, l2);
    }
}
