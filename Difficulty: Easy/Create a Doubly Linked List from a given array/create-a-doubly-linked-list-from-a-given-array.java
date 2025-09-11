/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node h=new Node(arr[0]);
        Node cur=h;
        for(int i=1;i<arr.length;i++){
        Node nnode=new Node(arr[i]);
        cur.next=nnode;
        nnode.prev=cur;
        cur=nnode;
        }
        return h;
    }
}