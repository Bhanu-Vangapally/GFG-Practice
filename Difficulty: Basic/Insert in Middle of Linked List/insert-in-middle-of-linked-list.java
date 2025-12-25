/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
         if (head == null) {
            return new Node(x);
        }

        Node slow = head;
        Node fast = head;

        // Find middle (first middle in even length)
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Insert after middle
        Node newNode = new Node(x);
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
