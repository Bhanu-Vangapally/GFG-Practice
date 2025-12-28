class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer> m=new LinkedHashMap<>();
        for(char i:s.toCharArray()) m.put(i,m.getOrDefault(i,0)+1);
        for(char c:m.keySet()){
            if(m.get(c)==1) return c;
        }
        return '$';
    }
}
