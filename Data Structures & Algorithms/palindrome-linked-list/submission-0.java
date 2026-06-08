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
        ArrayList<Integer> l = new ArrayList<>();
        while(head != null)
        {
            l.add(head.val);
            head = head.next;
        }
        int lo=0;
        int r= l.size()-1;
        while (lo<r)
        {
            if(!l.get(lo).equals(l.get(r)))
            {
                return false;
            }
            lo++;
            r--;
        }
        return true;
    }
}