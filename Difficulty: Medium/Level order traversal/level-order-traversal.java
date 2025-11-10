/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
        lvl(root,l);
        return l;
    }
    private static void lvl(Node r,ArrayList<ArrayList<Integer>> l){
        Queue<Node> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node tmp=q.poll();
                l1.add(tmp.data);
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
            }
            l.add(l1);
        }
    }
}