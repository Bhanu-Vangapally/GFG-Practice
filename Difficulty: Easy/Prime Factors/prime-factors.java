class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> l =new ArrayList<>();
        if(n<=1) return l;
        while(n%2==0){
            if(!l.contains(2)) l.add(2);
            n/=2;
        }
        while(n%3==0){
            if(!l.contains(3)) l.add(3);
            n/=3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                if(!l.contains(i)) l.add(i);
                n/=i;
            }
            while(n%(i+2)==0){
                if(!l.contains(i+2)) l.add(i+2);
                n/=(i+2);
            }
        }
        if(n>3) l.add(n);
        return l;
    }
}