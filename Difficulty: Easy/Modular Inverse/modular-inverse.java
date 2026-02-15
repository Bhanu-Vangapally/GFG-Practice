class Solution {
    public int modInverse(int n, int m) {
        // code here
        for(int i=1;i<m;i++){
            if((long)(n*i)%m==1) return i;
        }
        return -1;
    }
}
