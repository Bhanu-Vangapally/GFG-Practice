class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int i1=gcd_fun(a,b);
        int i2=lcm_fun(a,b,i1);
        return new int[]{i2,i1};
    }
        static int lcm_fun(int a,int b,int gcd){
            // if(a==0 || b==0) return 0;
            // long prd=(long)a*b;
            // int gcd=gcd_fun(a,b);
            // return (int)(prd/gcd);
            return (int) ((long) Math.abs(a) * Math.abs(b) / gcd);
        }
         static int gcd_fun(int a,int b){
             if(b==0) return a;
             return gcd_fun(b,a%b);
         }
}