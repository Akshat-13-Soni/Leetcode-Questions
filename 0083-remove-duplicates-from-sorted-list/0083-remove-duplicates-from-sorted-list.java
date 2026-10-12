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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;                          //set curr pointer at head
        while(curr!=null && curr.next!=null){          //move until not null
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;              //directly move to the non matching node 
            }
            else{
                curr=curr.next;                        //increment curr pointer after loop
            }
        }
        return head;
    }
}