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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode temp=head;
        ListNode s=null;
        ListNode e=null;
        ListNode before=null;
        int i=1;
        while(temp!=null){
            if(i==left) s=temp;
            if(i==right) e=temp;
            if(i==left-1) before=temp;
            i++;
            temp=temp.next;
        }
        ListNode after=e.next;
        ListNode prev=after;
        temp=s;
        while(temp!=after){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        if(before!=null) before.next=prev;
        else head=prev;
        return head;
    }
}