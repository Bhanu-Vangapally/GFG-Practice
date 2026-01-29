class Solution {
    public int countDigits(int n) {
        // code here
        int res=0;
        while(n!=0){
            res++;
            n/=10;
        }
        return res;
    }
}
