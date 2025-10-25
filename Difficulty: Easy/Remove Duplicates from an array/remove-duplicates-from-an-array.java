class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> l=new ArrayList<Integer> ();
        for(int i:arr){
            if(!l.contains(i)) l.add(i);
        }
        return l;
    }
}