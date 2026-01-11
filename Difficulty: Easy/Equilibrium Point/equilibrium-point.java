class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int ts=0;
        for(int i:arr) ts+=i;
        int ls=0;
        for(int i=0;i<arr.length;i++){
            int cs=arr[i];
            int rs=ts-ls-cs;
            if(ls==rs) return i;
            ls+=cs;
        }
        return -1;
    }
}
