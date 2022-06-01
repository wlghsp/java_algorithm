package leetcode.finished.Leetcode234_PalindromeLinkedList;

public class Leetcode234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        // slow를 중간 지점까지 이동
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 전체 길이가 홀수면 한 칸 더 이동 (가운데 값을 비교할 필요 없음)
        if (fast != null ) slow = slow.next;


        // 중간부터 마지막까지 노드 순서 뒤집기
        ListNode tail = reverse(slow);

        while (tail != null) {
            if (head.val != tail.val) {
                return false;
            }

            head = head.next;
            tail = tail.next;
        }
        return true;

    }

    private ListNode reverse(ListNode node) {
        ListNode tail = null;

        while (node != null)  {
            ListNode next = node.next;
            node.next = tail;
            tail = node;
            node = next;
        }
        return tail;
    }

    public static void main(String[] args) {


    }
}
