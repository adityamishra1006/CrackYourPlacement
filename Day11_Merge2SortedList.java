
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.val<=temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;

        return dummy.next;
    }
}
