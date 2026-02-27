class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        int n=arr.length;
        if(n==0) return l;
        int xor = 0, res1 = 0, res2 = 0; 
        for (int i = 0; i < n; i++) xor = xor ^ arr[i]; 
        int sn = xor & (~(xor - 1)); 
        for (int i = 0; i < n; i++) 
        { 
            if ((arr[i] & sn) != 0) 
                res1 = res1 ^ arr[i]; 
            else
                res2 = res2 ^ arr[i]; 
        } 
        if(res1>=res2){
            l.add(res1);
            l.add(res2);
        }
        else{
            l.add(res2);
            l.add(res1);
        }
        return l;
    }
}
