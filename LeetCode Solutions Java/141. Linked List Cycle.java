/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    //Method 1: use a hash table time: 0(n), space: O(n)
    
    //method 2: using tortoise method, time O(n), space(1)
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        
        ListNode slow = head, fast = head;
        while(fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
