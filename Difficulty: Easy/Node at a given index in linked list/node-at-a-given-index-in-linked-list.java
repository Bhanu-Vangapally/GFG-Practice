/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        if(head==null) return -1;
        int c=1;
        Node s=head;
        while(s!=null ){
            if(c==index) return s.data;
            s=s.next;
            c++;
        }
        return -1;
    }
}