/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if (head == null) return null;

        // If deleting the first node
        if (x == 1) {
            return head.next;
        }

        Node t = head;
        int count = 1;

        // Move to (x-1)th node
        while (t != null && count < x - 1) {
            t = t.next;
            count++;
        }

        // If x is out of bounds
        if (t == null || t.next == null)
            return head;

        // Skip the xth node
        t.next = t.next.next;

        return head;
    }
}