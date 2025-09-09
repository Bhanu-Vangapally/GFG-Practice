class Solution {
    int majorityElement(int arr[]) {
        // code here
        int fq=arr.length/2;
        if(fq==0) return arr[0];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr) m.put(i,m.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>fq) return e.getKey();
        }
        return -1;
    }
}