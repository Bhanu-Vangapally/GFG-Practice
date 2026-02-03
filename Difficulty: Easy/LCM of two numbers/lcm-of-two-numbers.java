class Solution {
    public int lcm(int a, int b) {
        // code here
        int g=gcd(a,b);
        return (a*b)/g;
    }
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}