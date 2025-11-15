/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head==null || head.next==null) return;
        Node s,f;
        s=f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) break;
        }
        if(f==null || f.next==null) return;
        s=head;
        if(s==f){
            while(f.next!=s){
                f=f.next;
            }
            f.next=null;
            return;
        }
        Node p=null;
        while(s!=f){
            p=f;
            s=s.next;
            f=f.next;
        }
        p.next=null;
    }
}