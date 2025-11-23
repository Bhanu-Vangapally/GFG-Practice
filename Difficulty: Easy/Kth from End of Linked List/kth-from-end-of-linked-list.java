/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null) return -1;
        Node t=head;
        int n=0;
        while(t!=null){
            n++;
            t=t.next;
        }
        if(k>n) return -1;
        int r=n-k;
        t=head;
        for(int i=0;i<r;i++){
            t=t.next;
        }
        int ans=t.data;
        return ans;
    }
}