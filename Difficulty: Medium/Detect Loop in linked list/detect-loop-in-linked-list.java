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
    public boolean detectLoop(Node head) {
        // code here
        Node s,f;
        s=f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) return true;
        }
        return false;
    }
}