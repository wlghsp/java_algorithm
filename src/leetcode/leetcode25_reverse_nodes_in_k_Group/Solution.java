package leetcode.leetcode25_reverse_nodes_in_k_Group;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode groupStart = prevGroupEnd.next;
            ListNode current = groupStart;
            int count = 0;

            while (current != null && count < k) {
                current = current.next;
                count++;
            }

            if (count < k) {
                break;
            }

            ListNode groupEnd = reverseGroup(groupStart, current);

            prevGroupEnd.next = groupEnd;
            groupStart.next = current;

            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    private ListNode reverseGroup(ListNode start, ListNode end) {
        ListNode prev = end;

        while (start != end) {
            ListNode temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }

        return prev;
    }
}
