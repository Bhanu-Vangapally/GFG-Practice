/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        if(head==null || head.next==null) return head;
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.data==cur.next.data) cur.next=cur.next.next;
            else cur=cur.next;
        }
            return head;
    }
}