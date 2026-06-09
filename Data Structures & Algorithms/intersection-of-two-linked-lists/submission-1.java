/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode hA, ListNode hB) {
        ListNode t1 = hA;
        ListNode t2 = hB;
        int n1 = len(t1);
        int n2 = len(t2);
        int o;
        if(n1>n2)
        {
            o= n1-n2;
            while(o!=0)
            {
                hA = hA.next;
                o--;
            }
        }
        else
        {
            o= n2-n1;
            while(o!=0)
            {
                hB = hB.next;
                o--;
            }
        }
        while(hA!= null && hB != null)
        {
            if(hA == hB)
            {
                return hA;
            }
            hA= hA.next;
            hB = hB.next;
        }
        return null;
    }
    private int len(ListNode t)
    {
        int c=0;
        while(t!= null)
        {
            c++;
            t= t.next;
        }
        return c;
    }
}