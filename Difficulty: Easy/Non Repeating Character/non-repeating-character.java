class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer>m=new LinkedHashMap<>();
        for(char i:s.toCharArray()){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        // System.out.print(m);
        for(Map.Entry<Character,Integer> e:m.entrySet()){
            if(e.getValue()==1) return e.getKey();
        }
        return '$';
    }
}
