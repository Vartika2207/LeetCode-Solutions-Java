/time: O(n), space: O(1)
class Solution {
    ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode node = head.next;
        head.next = null;
        
        ListNode tail = node;
        ListNode reversed_node = reverseList(node);
        tail.next = head;
        return reversed_node;
        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1)
            return head;
        
        int count = 0;
        ListNode curr = head;
        while(curr != null){
                curr = curr.next;
                count++;
            }
        
        if(count < k)
            return head;
        
        curr = head;
        for(int i=1; i< k; i++){
            curr = curr.next;
        }
        ListNode curr_next = curr.next;
        curr.next = null;
        ListNode temp_head = head;
        ListNode k_reversed_node = reverseList(head);
        temp_head.next = reverseKGroup(curr_next, k);
        
        return k_reversed_node;
        
    }
};
