/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node s,f,pr;
        s=null;
        if(head==null || head.next==null) return s;
        s=f=pr=head;
        while(f!=null && f.next!=null){
            pr=s;
            s=s.next;
            f=f.next.next;
        }
        pr.next=s.next;
        return head;
    }
}