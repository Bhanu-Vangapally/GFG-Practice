/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Count the length of the list
        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        // If k is equal to length, no rotation needed
        k = k % len;
        if (k == 0) return head;

        // Step 2: Connect last node to head (make circular)
        curr.next = head;

        // Step 3: Move (k-1) steps to reach new tail
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        // Step 4: New head is newTail.next
        Node newHead = newTail.next;

        // Step 5: Break the circular link
        newTail.next = null;

        return newHead;
    }
}
