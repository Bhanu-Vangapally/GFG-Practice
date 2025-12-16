class Solution {
    public static boolean prime(int n) {
        // Write your code here
        if(n<2) return false;
        int c=0;
        for(int i=2;i<=n;i++){
            if(n%i==0) c++;;
        }
        return c==1;
    }
}