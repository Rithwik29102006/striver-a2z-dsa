class Solution {

    public Node flatten(Node head) {

        if (head == null)
            return null;

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node child = curr.child;

                Node tail = child;

                // Find child list's tail
                while (tail.next != null) {
                    tail = tail.next;
                }

                // Connect child tail to original next
                if (curr.next != null) {
                    curr.next.prev = tail;
                }

                tail.next = curr.next;

                // Connect current node to child
                curr.next = child;
                child.prev = curr;

                // Remove child pointer
                curr.child = null;
            }

            curr = curr.next;
        }

        return head;
    }
}
