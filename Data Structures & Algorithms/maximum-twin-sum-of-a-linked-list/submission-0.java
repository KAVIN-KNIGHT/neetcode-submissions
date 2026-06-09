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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode t= head;
        while(head != null)
        {
            head= head.next;
            n++;
        }
        int[] a= new int[n];
        int j=0;
        while(t != null)
        {
            
            a[j]= t.val;
            t= t.next;
            j++;
        }
        int ma= 0;
        for(int i=0;i<n/2;i++)
        {
            ma = Math.max(ma,a[i]+a[n-1-i]);
        }
        return ma;
    }
}