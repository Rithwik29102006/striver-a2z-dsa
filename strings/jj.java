class Solution {
    public void deleteNode(ListNode node) {
        // Copy value of next node
        node.val = node.next.val;

        // Bypass the next node
        node.next = node.next.next;
    }
}
