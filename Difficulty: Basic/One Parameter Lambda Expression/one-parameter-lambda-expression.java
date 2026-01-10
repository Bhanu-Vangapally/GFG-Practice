// User function Template for Java

/*
The interface looks like

interface Multiply {
    public int multiplyBy5(int n);
}
*/

class Solution {

    public static Multiply helperFunction() {
        // Your code here
        

        // Implement the multiplyBy5(int n) method using lambda expression. The
        // implemented function should return n*5
        Multiply obj=(int n)->5*n;
        return obj;
    }
}