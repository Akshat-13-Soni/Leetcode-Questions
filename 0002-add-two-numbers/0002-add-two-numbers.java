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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = new ListNode(0);   // placeholder so sumCurr isn't null
        ListNode sumCurr = head;
        int carry = 0;
        while(curr1!=null || curr2!=null || carry!=0){
            int sum = carry;
            if(curr1!=null){
                sum+=curr1.val;
                curr1=curr1.next;
            }
            if(curr2!=null){
                sum+=curr2.val;
                curr2=curr2.next;
            }
            sumCurr.next = new ListNode(sum%10);
            sumCurr = sumCurr.next;
            carry = sum/10;
        }
        return head.next;
    }
}