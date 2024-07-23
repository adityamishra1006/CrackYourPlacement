class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }


        int value = Integer.parseInt(sb.toString(),2);

        return value;


    }
}
