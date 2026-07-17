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
        ListNode fast=head;
        ListNode slow=head;
        ListNode mid=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        mid=slow;
        ListNode current=mid;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        slow=head;
        fast=prev;

        while(slow!=mid && fast!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}