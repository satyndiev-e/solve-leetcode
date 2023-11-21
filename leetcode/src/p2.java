import java.util.*;

public class p2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;

        int temp = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }

            l3.next = new ListNode(temp % 10);
            l3 = l3.next;
            temp /= 10;
        }
        if (temp == 1) {
            l3.next = new ListNode(1);
        }
        return head.next;
    }
}
