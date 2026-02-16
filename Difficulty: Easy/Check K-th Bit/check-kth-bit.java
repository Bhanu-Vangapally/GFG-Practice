class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if(k==0) return (n&1)==1;
        while(k-->0){
            n>>=1;
        }
        return (n&1)==1;
    }
}