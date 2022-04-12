package leetcode;




public class Leetcode206_ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }


    /*
1. reverse된 결과를 리턴할 ListNode 타입의 node를 선언한다.
2. 시작 노드부터 마지막 노드ㅜ까지 각 노드가 순차적으로 head가 되어 반복문을 수행한다.
3. head노드를 변경하기 전에 저장해 둔 temp 노드의 next값에 node를 할당한다.
4. 글로 백 번 적는 것보다, 한 번 그림으로 그리면서 로직을 따라가면 더 확실히 이해가 될 것이다.

 */

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
