package June;

/**
 * @Author: zhangdanjin
 * @Date: 2020/6/22 20:44
 */
public class Solution_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode listNode = new ListNode(0);
        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null) {
            l2 = new ListNode(0);
        }
        int var1 = l1.val;
        int var2 = l2.val;

        if (var1 < 0 || var2 < 0) {
            return null;
        }
        listNode.val += (var1 + var2) % 10;
        if ((var1 + var2) / 10 > 0) {
            if (l1.next != null) {
                l1.next.val += ((var1 + var2) / 10);
            } else {
                l1.next = new ListNode(((var1 + var2) / 10));
            }

        }
        listNode.next = addTwoNumbers(l1.next, l2.next);

        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-3);
        ListNode l2 = new ListNode(4);
        l1.next = new ListNode(0);
//        l2.next = new ListNode(3);
        Solution_2 solution3 = new Solution_2();
        ListNode listNode = solution3.addTwoNumbers(l1, l2);
    }
}


