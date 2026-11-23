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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        int m=-1;
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        m=m/2;
        temp=head;
        while(i!=m){
            temp=temp.next;
            i++;
        }
        ListNode b=temp.next;
        temp.next=null;
        ListNode a=head;
        temp=b;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        b=prev;
        i=0;
        while(b!=null){
            ListNode na=a.next;
            ListNode nb=b.next;
            a.next=b;
            b.next=na;
            a=na;
            b=nb;
        }
    }
}