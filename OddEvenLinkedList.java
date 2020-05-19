public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null || head.next.next == null) {
        return head;
    }

    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead = even;

    while (even != null && even.next != null) {
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
    }

    odd.next = evenHead;

    return head;
}

/*
 * Construct the odd list and even list first
 * Then combine the odd list to the even list
 * Return the head
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
