// Last updated: 14/07/2026, 14:31:55
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
    public ListNode rotateRight(ListNode head, int k) 
    {
        ListNode temp=head,temp1=head;
        int c=1;
        if(head==null || head.next==null)
        {
            return head;
        }
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%c;
        for(int i=0;i<c-k-1;i++)
        {
            temp1=temp1.next;
        }
        head=temp1.next;
        temp1.next=null;
        return head;

        
    }
}