/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    private Node reverse(Node head){
        Node prev=null,cur=head,nxt=null;
        while(cur!=null){
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        Node cur=head;
        int cry=1;
        while(cur!=null){
            int s=cur.data+cry;
            cur.data=s%10;
            cry=s/10;
            if(cry==0) break;
            if (cur.next == null) break;
            cur = cur.next;
        }
        if (cry == 1) {
            cur.next = new Node(1);
        }
        head=reverse(head);
        return head;
    }
}