package leetcode.finished.LeetCode83_RemoveDuplicatesFromSortedList;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
