/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node prev,cur;
        prev=head;
        cur=head.next;
        while(cur!=null){
            Node nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        head.next=null;
        head=prev;
        return head;
    }
}