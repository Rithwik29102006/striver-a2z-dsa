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
    // Primary entry point for LeetCode
    public ListNode sortList(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle node to split the list
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null; // Break the link to split into two halves
        ListNode left = head;

        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);

        // Merge the sorted halves together
        return mergeTwoLists(left, right);
    }

    // Helper function to find the middle node
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // Starts one step ahead to find the first middle in even lists

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper function to merge two sorted linked lists
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            // Corrected from .data to .val to match the class definition
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummyNode.next;
    }
}
