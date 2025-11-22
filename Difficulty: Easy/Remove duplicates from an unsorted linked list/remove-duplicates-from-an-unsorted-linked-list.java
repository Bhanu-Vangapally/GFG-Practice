/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Set<Integer> l=new HashSet<>();
        Node t=head;
        Node prev=null;
        while(t!=null){
            if(l.contains(t.data)){
                prev.next=t.next;
            }
            else{ 
                l.add(t.data);
                prev=t;
            }
             t=t.next;
        }
        return head;
    }
}