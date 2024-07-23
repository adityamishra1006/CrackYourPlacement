class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<>();
        ListNode dummy = head;

        while(dummy != null){
            reverse.push(dummy);
            dummy = dummy.next;
        }

        while(head != null && !reverse.isEmpty()){
            if(reverse.pop().val != head.val) return false;
            else{
                head = head.next;
            }
        }
        return true;
    }
}
