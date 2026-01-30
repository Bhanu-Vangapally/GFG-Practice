class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=0) arr[i]=n+1;
        }
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i])<=n){
                int bucketidx=Math.abs(arr[i])-1;
                if(arr[bucketidx]>0) arr[bucketidx]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;
    }
}
