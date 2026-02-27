class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int x=0;
        for(int i:arr) x^=i;
        return x;
    }
}