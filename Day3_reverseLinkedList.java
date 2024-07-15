class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode Next = null;

        while(current != null){
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        return prev;
    }
}
