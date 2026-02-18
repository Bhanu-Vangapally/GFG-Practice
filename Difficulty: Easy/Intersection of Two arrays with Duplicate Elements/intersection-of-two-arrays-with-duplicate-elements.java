class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i:a) l.add(i);
        for(int i:b) if(l.contains(i)) if(!ans.contains(i)) ans.add(i);
        return ans;
    }
}