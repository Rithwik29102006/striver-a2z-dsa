class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode s = small;
        ListNode l = large;

        ListNode temp = head;

        while (temp != null) {

            if (temp.val < x) {
                s.next = temp;
                s = s.next;
            } else {
                l.next = temp;
                l = l.next;
            }

            temp = temp.next;
        }

        // Connect both lists
        s.next = large.next;

        // Important: terminate the large list
        l.next = null;

        return small.next;
    }
}
