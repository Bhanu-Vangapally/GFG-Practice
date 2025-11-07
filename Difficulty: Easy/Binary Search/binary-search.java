class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        // int low=0,high=arr.length-1;
        // while(low<=high){
        //     int m=low+(high-low)/2;
        //     if(arr[m]==k) return m;
        //     else if(arr[m]<k) low=m+1;
        //     else high=m-1;
        // }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return i;
        }
        // int i=Arrays.binarySearch(arr,k);
        // if(i<0) return -1;
        return -1;
    }
}