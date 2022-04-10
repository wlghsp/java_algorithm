package leetcode;





public class Leetcode206_ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode parent = null;

        while (head != null) {
            ListNode current = head;
            head = head.next;
            current.next = parent;
            parent = current;
        }

        return parent;
    }


    public static void main(String[] args) {
        Leetcode206_ReverseLinkedList T = new Leetcode206_ReverseLinkedList();


    }
}
