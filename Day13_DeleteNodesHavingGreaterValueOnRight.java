class Solution
{
    Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    Node compute(Node head)
    {
        // your code here
        if(head == null || head.next == null){
            return head;
        }
        head = reverse(head);
        
        Node current = head;
        Node maxNode = head;
        
        while(current != null && current.next != null){
            if(current.next.data < maxNode.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
                maxNode = current;
            }
        }
        head = reverse(head);
        return head;
    }
}
  
