// User function Template for Java

class Solution {
    static int fib(int N) {
        // code here
        if(N==0) return 0;
        if(N==1) return 1;
        int k=0,f1=0,f2=1;
        for(int i=2;i<=N;i++){
            k=(f1+f2)%10;
            f1=f2;
            f2=k;
        }
        return k;
    }
}