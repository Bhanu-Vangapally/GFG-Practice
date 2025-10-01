// User function Template for Java
class Solution {
    public int findSize(Node head) {
        // Code Here
        int c=0;
        if(head==null) return c;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}
