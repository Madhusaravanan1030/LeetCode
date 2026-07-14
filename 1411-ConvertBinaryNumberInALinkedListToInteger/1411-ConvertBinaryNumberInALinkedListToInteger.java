// Last updated: 14/07/2026, 14:30:42
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
    public int getDecimalValue(ListNode head) 
    {
        String str="";
        ListNode temp=head; 
        while(temp!=null)
        {
            str=str+temp.val;
            temp=temp.next;
        }
        int n=Integer.parseInt(str,2);
        return n;
    }
}