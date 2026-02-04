import java.util.*;

class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        int r = 2;
        // Compute and Print
        System.out.println((int)termOfGP(a,r,n));
        
    }
    public static double termOfGP(int a, int r, int n) {
        // code here
        double rd=r*1.0;;
        double p=pow(rd,n-1);
        return p*a;
        
    }
    private static double pow(double a,int b){
        double t=0;
        if(b==0) return 1;
        t=pow(a,b/2);
        if(b%2==0) return t*t;
        else return a*t*t;
    }
}
