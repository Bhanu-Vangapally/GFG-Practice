class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        Deque<Integer> sk=new ArrayDeque<>();
        for(int i:arr) sk.push(i);
        l.add(sk.pop());
        while(!sk.isEmpty()){
            if(sk.peek()>=l.get(l.size()-1)) l.add(sk.pop());
            else sk.pop();
        }
        Collections.reverse(l);
        return l;
    }
}
