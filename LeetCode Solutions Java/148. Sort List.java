class Solution {

    //time: O(nlogn), space: O(logn)
    ListNode findMid(ListNode h){
          if(h == null || h.next == null)
              return h;
        
        ListNode slow = h;
        ListNode fast = h;
        ListNode slowPre = h;
        
        while(fast != null && fast.next != null){
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        slowPre.next = null;
        return slow;
    }
    
    ListNode mergeList(ListNode h1, ListNode h2) {
        if(h1==null) return h2;
        if(h2==null) return h1;
        
        ListNode head=null,tail=null;
        
        while(h1 != null && h2 != null){
             if(head == null){
                if(h1.val < h2.val){
                    head=h1; tail=h1;
                    h1=h1.next;
                }
                else{
                    head=h2; tail=h2;
                    h2=h2.next;
                }
            }
            else{
                if(h1.val<h2.val){
                    tail.next=h1; tail=h1;
                    h1=h1.next;
                }
                else{
                    tail.next=h2; tail=h2;
                    h2=h2.next;   
                }
            }
        }
        
        if(h2==null){
            tail.next=h1;
        }
        if(h1==null){
            tail.next=h2;
        }
        return head;
    }
    
    
    ListNode sortList_(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode mid = findMid(head);
        ListNode left = sortList_(head);
        ListNode right = sortList_(mid);
        
        ListNode sortedList = mergeList(left, right);
        return sortedList;
    } 
    
    public ListNode sortList(ListNode head) {
     return sortList_(head);   
    }
};
