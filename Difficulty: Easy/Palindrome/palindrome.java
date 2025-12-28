class Solution {
    public boolean isPalindrome(int n) {
        // code here
        String s="";
        s+=n;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}