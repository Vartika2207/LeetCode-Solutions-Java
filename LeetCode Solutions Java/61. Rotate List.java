/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    //METHOD-1
    /*
    naive approach:
    pick last node, put in front and do this k-times
    
    time: 0(k*n), space: O(1)
    */
    
   
    int length(ListNode head){
        if(head == null)
            return 0;
        
        return 1 + length(head.next);
    }
    
    //METHOD-2
     //time: O(n), space: O(1)
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null)
            return head;
        
        //len is length of list
        int len = length(head);
        k = k%len;
        
        if(k == 0)
            return head;
        
        //breaking list into 2 parts
        ListNode temp = head;
        for(int i=1; i<(len - k); i++){
            temp = temp.next;
        }
        
        ListNode new_head = temp.next;
        temp.next = null;
        //finding tail of new_head and connect it to head 
        ListNode new_tail = new_head;
        while(new_tail.next != null){
            new_tail = new_tail.next;
        }
        new_tail.next = head;
        return new_head;
    }
    
    //METHOD-3
     //time: O(n), space: O(1)
    /*
    Connect last node to head and make it circular-list, traverse from head (len - k%len) times and return that pointed node.
    */
    
}
