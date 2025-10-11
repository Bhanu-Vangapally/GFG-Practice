class Solution {
    public static boolean prime(int n) {
        // Write your code here
        if(n<2) return false;
        // if(n==2) return true;
        int k=0;
        for(int i=2;i<=n;i++){
            if(n%i==0) k++;
        }
        return k==1;
    }
}