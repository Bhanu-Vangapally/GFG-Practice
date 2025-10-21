class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0,original=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev==original;
    }
}