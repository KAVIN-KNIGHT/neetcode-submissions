class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int c = 0;
        ListNode t = head;

        while (t != null) {
            c++;
            t = t.next;
        }

        if (n == c) {
            return head.next;
        }

        t = head;

        for (int i = 1; i < c - n; i++) {
            t = t.next;
        }

        t.next = t.next.next;

        return head;
    }
}