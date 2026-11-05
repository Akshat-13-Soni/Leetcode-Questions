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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev = null;
        while(slow!=null){
            ListNode ahead = slow.next;
            slow.next=prev;
            prev=slow;
            slow=ahead;
        }
        ListNode start = head;
        ListNode end = prev;
        while(end!=null){
            if(start.val!=end.val){
                return false;
            }
            start=start.next;
            end=end.next;
        }
        return true;
    }
}