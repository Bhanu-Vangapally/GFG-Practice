class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i)==k) return i;
        }
        return -1;
    }
}