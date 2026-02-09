class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            if(mp.containsKey(target-i)) return true;
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        return false;
    }
}