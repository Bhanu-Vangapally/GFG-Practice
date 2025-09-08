class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int s=Integer.MIN_VALUE;
        int c=0;
        for(int i:arr){
            c+=i;
            if(c>s) s=c;
            if(c<0) c=0;
        }
        return s;
    }
}
