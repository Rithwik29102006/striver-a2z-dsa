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
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow pointer to head
        ListNode slow = head;

        // Initialize fast pointer two steps ahead
        ListNode fast = head.next.next;

        // Traverse until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Bypass the middle node
        slow.next = slow.next.next;

        // Return head of updated list
        return head;
    }
}
