class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int p=rev(n);
        return pow(n,p);
    }
    private int pow(int a,int b){
        if(b==0 || a==1) return 1;
        int t=pow(a,b/2);
        if(b%2==0) return t*t;
        return t*t*a;
    }
    private int rev(int n){
        int r=0,rm=0;
        while(n>0){
            rm=n%10;
            r=r*10+rm;
            n/=10;
        }
        return r;
    }
}
