class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListRev {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }

    public static void main(String[] args) {
        // Create the original linked list: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        LinkedListRev solution = new LinkedListRev();
        ListNode reversedHead = solution.reverseList(head);


        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.print("null");
}
}