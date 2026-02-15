class Solution {
    public int nthTerm(int a, int r, int n) {
        long m = 1000000007;
        // Use long for calculations to prevent overflow
        long p = power(r, n - 1, m);
        return (int) ((a * p) % m);
    }

    private long power(long base, int exp, long mod) {
        long res = 1;
        base %= mod; // Handle cases where base >= mod
        
        while (exp > 0) {
            // If exponent is odd, multiply res with base
            if (exp % 2 == 1) res = (res * base) % mod;
            
            // Square the base and divide exponent by 2
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}
